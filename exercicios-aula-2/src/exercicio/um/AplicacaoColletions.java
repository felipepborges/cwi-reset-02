package exercicio.um;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AplicacaoColletions {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        Diretor christopherNolan = new Diretor("Christopher Nolan", LocalDate.parse("30-07-1970", formatter), 10, Genero.MASCULINO);

        Ator christianBale = new Ator("Christian Bale", LocalDate.parse("30-01-1974", formatter), 3, Genero.MASCULINO);
        Ator morganFreeman = new Ator("Morgan Freeman", LocalDate.parse("01-06-1937", formatter), 5, Genero.MASCULINO);
        Ator maggieGyllenhaal = new Ator("Maggie Gyllenhaal", LocalDate.parse("16-11-1977",formatter), 2, Genero.FEMININO);

        List<Pessoa> elencoBatman = new ArrayList<>();
        elencoBatman.add(christopherNolan);
        elencoBatman.add(christianBale);
        elencoBatman.add(morganFreeman);
        elencoBatman.add(maggieGyllenhaal);


        Filme batman = new Filme("Batman: O Cavaleiro das Trevas", "Filme do Batman", 270,
                2008, 4.5, christopherNolan, elencoBatman);

        System.out.println(batman.reproduzir());
        batman.exibirCreditos();
    }
}
