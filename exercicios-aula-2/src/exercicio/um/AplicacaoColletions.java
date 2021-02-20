package exercicio.um;
import java.util.ArrayList;
import java.util.List;

public class AplicacaoColletions {

    public static void main(String[] args) {


        Diretor christopherNolan = new Diretor("Christopher Nolan", 60, 10, Genero.MASCULINO);

        Ator christianBale = new Ator("Christian Bale", 40, 3, Genero.MASCULINO);
        Ator morganFreeman = new Ator("Morgan Freeman", 83, 5, Genero.MASCULINO);
        Ator maggieGyllenhaal = new Ator("Maggie Gyllenhaal", 43, 2, Genero.FEMININO);

        List<Ator> elencoBatman = new ArrayList<>();
        elencoBatman.add(christianBale);
        elencoBatman.add(morganFreeman);
        elencoBatman.add(maggieGyllenhaal);


        Filme batman = new Filme("Batman: O Cavaleiro das Trevas", "Filme do Batman", 270,
                2008, 4.5, christopherNolan, elencoBatman);

        System.out.println(batman.reproduzir());
        batman.exibirCreditos();

    }
}
