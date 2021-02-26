package com.company.heranca;

import com.company.enumerador.Genero;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private Genero genero;
    private int idade;

    public Pessoa(String nome, LocalDate dataNascimento, Genero genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public int getIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    public String getInformacao(){
        return "Nome: " + this.nome +
                "\nIdade: " +  getIdade() + " anos" +
                "\nGênero: " + this.genero.toString() + "\n";
    }

    public String getNome() {
        return nome;
    }
}

