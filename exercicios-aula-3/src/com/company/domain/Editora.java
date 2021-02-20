package com.company.domain;

import com.company.exceptions.EditoraException;

public class Editora {

    private String nome;
    private String localizacao;

    public Editora(String nome, String localizacao) {
        validaNomeEditora(nome);
        this.nome = nome;
        this.localizacao = localizacao;
    }

    private void validaNomeEditora(String nome){
        if(nome.equalsIgnoreCase("DC Comics")){
           throw new EditoraException("\n\nMarvel > DC Comics. Não é possível cadastrar essa editora.");
        }
    }

    public String getNome() {
        return nome;
    }
}
