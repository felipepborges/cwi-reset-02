package br.com.cwi.resetflix.response;

import java.util.List;

import br.com.cwi.resetflix.domain.Genero;

public class ConsultarDetalhesSerieResponse {

    private Long id;
    private String nome;
    private List<Long> idsAtores;
    private Genero genero;
    private Integer temporadas;
    private Integer episodios;

    public ConsultarDetalhesSerieResponse(Long id, String nome, List<Long> idsAtores, Genero genero, Integer temporadas, Integer episodios) {
        this.id = id;
        this.nome = nome;
        this.idsAtores = idsAtores;
        this.genero = genero;
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public ConsultarDetalhesSerieResponse(Long id, String nome, Genero genero) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Long> getIdsAtores() {
        return idsAtores;
    }

    public void setIdsAtores(List<Long> idsAtores) {
        this.idsAtores = idsAtores;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }

    public Integer getEpisodios() {
        return episodios;
    }

    public void setEpisodios(Integer episodios) {
        this.episodios = episodios;
    }

}
