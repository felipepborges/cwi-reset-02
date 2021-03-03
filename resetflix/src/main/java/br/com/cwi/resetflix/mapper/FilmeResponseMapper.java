package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.response.FilmeResponse;

import java.util.ArrayList;
import java.util.List;

public class FilmeResponseMapper {

    public List<FilmeResponse> mapear(List<FilmeEntity> filmes) {
        List<FilmeResponse> responses = new ArrayList<>();

        for(FilmeEntity filmeEntity: filmes){
            responses.add(new FilmeResponse(filmeEntity.getGenero(), filmeEntity.getId(), filmeEntity.getNome()));
        }

        return responses;

    }


}
