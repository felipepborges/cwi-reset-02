package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FilmesRepository {

    static List<FilmeEntity> filmes = new ArrayList<>();
    static Long contadorIds = 1l;


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
        return null;
    }

    public Long criarFilme(final FilmeEntity filmeSalvar){
        if(filmeSalvar.getId() == null){
            filmeSalvar.setId(contadorIds);
            contadorIds++;
        }
        filmes.add(filmeSalvar);

        return filmeSalvar.getId();
    }
}
