package com.company;

import com.company.domain.Editora;
import com.company.domain.Filme;
import com.company.enumerador.Genero;
import com.company.heranca.Diretor;

public class AplicacaoTeste {

    public static void main(String[] args) {

        Editora marvel = new Editora("Marvel", "USA");
        System.out.println(marvel.getNome() + "\n");
        //Editora dcComics = new Editora("DC Comics", "USA");
        //System.out.println(dcComics.getNome());

        Diretor scottDerrickson = new Diretor("Scott Derrickson", 54, 5, Genero.MASCULINO);

        Filme doctorStrange = new Filme("Doctor Strange", "---",120, 2016, 4, scottDerrickson);
        doctorStrange.reproduzir();

        Filme filmeRuim = new Filme("Filme Ruim", "---",120, 2016, 0, scottDerrickson);
        filmeRuim.reproduzir();

        //Filme filmeBom = new Filme("Filme Bom", "---",120, 2016, 6, scottDerrickson);
        //filmeBom.reproduzir();



    }

}
