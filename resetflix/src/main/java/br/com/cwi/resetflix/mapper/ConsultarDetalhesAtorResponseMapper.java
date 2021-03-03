package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.response.ConsultarDetalhesAtorResponse;
import br.com.cwi.resetflix.response.FilmeResponse;

import java.util.List;

public class ConsultarDetalhesAtorResponseMapper {

    public ConsultarDetalhesAtorResponse mapear(AtorEntity atorSalvo, List<FilmeEntity> filmesAtor) {

        List<FilmeResponse> filmesResponse = new FilmeResponseMapper().mapear(filmesAtor);
        return new ConsultarDetalhesAtorResponse(filmesResponse, atorSalvo.getId(), atorSalvo.getNome());

    }
}
