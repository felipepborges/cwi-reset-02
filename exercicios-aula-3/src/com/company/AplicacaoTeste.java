package com.company;

import com.company.domain.Editora;
import com.company.domain.Filme;
import com.company.enumerador.Genero;
import com.company.heranca.Ator;
import com.company.heranca.Diretor;
import com.company.heranca.Pessoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AplicacaoTeste{

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        Pessoa christopherNolan = new Diretor("Christopher Nolan", LocalDate.parse("30-07-1970", formatter), 10, Genero.MASCULINO);

        //Ator christianBale = new Ator("Christian Bale", LocalDate.parse("30-01-1974", formatter), 3, Genero.MASCULINO);
        Pessoa christianBale = new Ator("Christian Bale", LocalDate.of(1974, 01, 30), 3, Genero.MASCULINO);
        Pessoa morganFreeman = new Ator("Morgan Freeman", LocalDate.parse("01-06-1937", formatter), 5, Genero.MASCULINO);
        Pessoa maggieGyllenhaal = new Ator("Maggie Gyllenhaal", LocalDate.parse("16-11-1977",formatter), 2, Genero.FEMININO);

        List<Pessoa> elencoBatman = new ArrayList<>();
        elencoBatman.add(christopherNolan);
        elencoBatman.add(christianBale);
        elencoBatman.add(morganFreeman);
        elencoBatman.add(maggieGyllenhaal);


        Filme batman = new Filme("Batman: O Cavaleiro das Trevas", "Filme do Batman", 270,
                2008, 4.5, christopherNolan, elencoBatman);

        //System.out.println(batman.reproduzir());
        //batman.exibirCreditos();
        //Map<Integer, List<Pessoa>> map = new HashMap<>();




    }

}
