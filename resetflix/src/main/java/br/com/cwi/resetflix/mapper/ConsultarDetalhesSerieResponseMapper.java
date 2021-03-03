package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;

public class ConsultarDetalhesSerieResponseMapper {

    public ConsultarDetalhesSerieResponse mapear(SerieEntity serieSalva) {
        return new ConsultarDetalhesSerieResponse(serieSalva.getId(), serieSalva.getNome(), serieSalva.getIdsAtores(),
                serieSalva.getGenero(), serieSalva.getTemporadas(), serieSalva.getEpisodios());
    }

}
