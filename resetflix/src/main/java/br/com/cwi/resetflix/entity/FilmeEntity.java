package br.com.cwi.resetflix.entity;

import br.com.cwi.resetflix.domain.Genero;

import java.util.List;

public class FilmeEntity {

    private Long id;
    private String nome;
    private Genero genero;
    private Long idDiretor;
    private List<Long> idsAtores;

    public FilmeEntity(Long id, final Genero genero, final Long idDiretor, final List<Long> idsAtores,   final String nome) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.idDiretor = idDiretor;
        this.idsAtores = idsAtores;
    }

    public FilmeEntity(String nome, Genero genero, Long idDiretor, List<Long> idsAtores) {
        this.nome = nome;
        this.genero = genero;
        this.idDiretor = idDiretor;
        this.idsAtores = idsAtores;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Long getIdDiretor() {
        return idDiretor;
    }

    public void setIdDiretor(Long idDiretor) {
        this.idDiretor = idDiretor;
    }

    public List<Long> getIdsAtores() {
        return idsAtores;
    }

    public void setIdsAtores(List<Long> idsAtores) {
        this.idsAtores = idsAtores;
    }
}
