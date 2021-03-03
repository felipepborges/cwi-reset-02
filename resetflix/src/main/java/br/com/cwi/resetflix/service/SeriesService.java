package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesSerieResponseMapper;
import br.com.cwi.resetflix.mapper.SerieResponseMapper;
import br.com.cwi.resetflix.mapper.SeriesEntityMapper;
import br.com.cwi.resetflix.repository.SeriesRepository;
import br.com.cwi.resetflix.request.CriarSerieRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;
import br.com.cwi.resetflix.response.SerieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesService {

    @Autowired
    private SeriesRepository seriesRepository;

    static SerieResponseMapper MAPPER_RESPONSE = new SerieResponseMapper();
    static SeriesEntityMapper MAPPER_ENTITY = new SeriesEntityMapper();
    static ConsultarDetalhesSerieResponseMapper MAPPER_DETALHES_SERIE = new ConsultarDetalhesSerieResponseMapper();

    public List<SerieResponse> getSeries(Genero genero) {
        List<SerieEntity> series = seriesRepository.getSeries(genero);
        return MAPPER_RESPONSE.mapear(series);
    }

    public ConsultarDetalhesSerieResponse getSerieById(Long id) {
        SerieEntity serieSalva= seriesRepository.acharSerieById(id);
        return MAPPER_DETALHES_SERIE.mapear(serieSalva);
    }

    public Long criarSerie(CriarSerieRequest request) {
        SerieEntity serieSalvar = MAPPER_ENTITY.mapear(request);
        return seriesRepository.criarSerie(serieSalvar);
    }
}
