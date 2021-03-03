package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.request.CriarSerieRequest;

public class SeriesEntityMapper {
    public SerieEntity mapear(CriarSerieRequest request) {
        return new SerieEntity(request.getEpisodios(), request.getGenero(), request.getIdsAtores(),
                request.getNome(), request.getTemporadas());
    }
}
