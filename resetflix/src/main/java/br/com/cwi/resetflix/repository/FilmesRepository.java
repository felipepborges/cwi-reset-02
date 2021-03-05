package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.exception.NotFoundException;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Stream;

@Repository
public class FilmesRepository {

    static List<FilmeEntity> filmes = new ArrayList<>();
    static List<FilmeEntity> filmesAssistidos = new ArrayList<>();
    static Long contadorIds = 1l;

    Map<Genero, Long> numeroVisualizacoesPorGenero = new HashMap<>();


    public List<FilmeEntity> getFilmes(Genero genero){
        if(genero==null){
            return filmes;
        }
        List<FilmeEntity> filmesPorGenero = new ArrayList<>();

        for(FilmeEntity filmeEntity : filmes){
            if(filmeEntity.getGenero().equals(genero)){
                filmesPorGenero.add(filmeEntity);
            }
        }
        return filmesPorGenero;
    }

    public List<FilmeEntity> acharFilmesAtor(Long id) {

        List<FilmeEntity> filmesAtor = new ArrayList<>();

        for(FilmeEntity filmeEntity : filmes){
           if(filmeEntity.getIdsAtores().contains(id)){
               filmesAtor.add(filmeEntity);
           }
        }
        return filmesAtor;
    }

    public List<FilmeEntity> acharFilmesDiretor(Long id) {

        List<FilmeEntity> filmesDiretor = new ArrayList<>();

        for(FilmeEntity filmeEntity : filmes){
            if(filmeEntity.getIdDiretor().equals(id)){
                filmesDiretor.add(filmeEntity);
            }
        }
        return filmesDiretor;
    }


    public FilmeEntity acharFilmeById(Long id) {
        for(FilmeEntity filmeEntity : filmes){
            if(filmeEntity.getId().equals(id)){
                return filmeEntity;
            }
        }
        throw new NotFoundException("Filme não encontrado");
    }

    public Long criarFilme(final FilmeEntity filmeSalvar){
        if(filmeSalvar.getId() == null){
            filmeSalvar.setId(contadorIds);
            contadorIds++;
        }
        filmes.add(filmeSalvar);

        return filmeSalvar.getId();
    }

    public void assistir(Long id){
        filmesAssistidos.add(acharFilmeById(id));
        salvarNumeroVisualizacoesPorGenero(acharFilmeById(id).getGenero());
    }

    public List<FilmeEntity> getRecomendacoes(){

        List<FilmeEntity> filmesRecomendados = filmes;
        //exclui os filmes assistidos da lista filmeRecomendados e diferentes do genero mais visualizado
        for(FilmeEntity filmeEntity : filmesRecomendados){
            if (filmesAssistidos.contains(filmeEntity) || filmeEntity.getGenero() != getGeneroMaisVisualizado()) {
                filmesRecomendados.remove(filmeEntity);
            }
        }
        return filmesRecomendados; //retorna todos os filmes cadastrados do genero mais visualizado
    }

    public void salvarNumeroVisualizacoesPorGenero(Genero genero){
        if(numeroVisualizacoesPorGenero.containsKey(genero)){
            numeroVisualizacoesPorGenero.put(genero, numeroVisualizacoesPorGenero.get(genero)+1);
        }
        numeroVisualizacoesPorGenero.put(genero, 1l);
    }

    public Genero getGeneroMaisVisualizado(){
        Map.Entry<Genero, Long> maisVisualizado = null;
        for(Map.Entry<Genero, Long> e: numeroVisualizacoesPorGenero.entrySet()){
            if(maisVisualizado == null || e.getValue().compareTo(maisVisualizado.getValue()) > 0){
                maisVisualizado = e;
            }
        }
        try{
            return maisVisualizado.getKey();
        }catch (NullPointerException e){
            return null;
        }
    }
}
