package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;

public class ConsultarDetalhesFilmeResponseMapper {

    public ConsultarDetalhesFilmeResponse mapear(FilmeEntity filmeSalvo) {
        return new ConsultarDetalhesFilmeResponse(filmeSalvo.getId(), filmeSalvo.getNome(), filmeSalvo.getGenero(),
                filmeSalvo.getIdDiretor(), filmeSalvo.getIdsAtores());
    }
}
