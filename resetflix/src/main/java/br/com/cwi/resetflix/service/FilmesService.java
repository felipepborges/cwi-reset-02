package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesFilmeResponseMapper;
import br.com.cwi.resetflix.mapper.FilmeResponseMapper;
import br.com.cwi.resetflix.mapper.FilmesEntityMapper;
import br.com.cwi.resetflix.repository.FilmesRepository;
import br.com.cwi.resetflix.request.CriarFilmeRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import br.com.cwi.resetflix.response.FilmeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmesService {

    @Autowired
    private FilmesRepository filmesRepository;

    static FilmeResponseMapper MAPPER_RESPONSE = new FilmeResponseMapper();
    static FilmesEntityMapper MAPPER_ENTITY = new FilmesEntityMapper();
    static ConsultarDetalhesFilmeResponseMapper MAPPER_DETALHES_FILMES = new ConsultarDetalhesFilmeResponseMapper();


    public List<FilmeResponse> getFilmes(Genero genero) {
        List<FilmeEntity> filmes  = filmesRepository.getFilmes(genero);
        return MAPPER_RESPONSE.mapear(filmes);
    }

    public ConsultarDetalhesFilmeResponse getFilmeById(Long id) {
        FilmeEntity filmeSalvo = filmesRepository.acharFilmeById(id);
        return MAPPER_DETALHES_FILMES.mapear(filmeSalvo);
    }

    public Long criarFilme(CriarFilmeRequest request) {
        FilmeEntity filmeSalvar = MAPPER_ENTITY.mapear(request);
        return filmesRepository.criarFilme(filmeSalvar);
    }
}
