package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.response.ConsultarDetalhesDiretorResponse;
import br.com.cwi.resetflix.response.FilmeResponse;

import java.util.List;

public class ConsultarDetalhesDiretorResponseMapper {

    public ConsultarDetalhesDiretorResponse mapear(DiretorEntity diretorSalvo, List<FilmeEntity> filmesDiretor) {

        List<FilmeResponse> filmesResponse = new FilmeResponseMapper().mapear(filmesDiretor);
        return new ConsultarDetalhesDiretorResponse(filmesResponse, diretorSalvo.getId(), diretorSalvo.getNome());

    }
}
