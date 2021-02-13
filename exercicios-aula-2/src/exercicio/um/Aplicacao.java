package exercicio.um;

public class Aplicacao {

    public static void main(String[] args) {


        Diretor jamesCameron = new Diretor("James Cameron", 70, 10, Genero.MASCULINO);

        Ator zoeSaldana = new Ator("Zoë Saldaña", 40, 2,Genero.FEMININO);

        // Filme avatar = new Filme("Avatar", "Ação no mundo alienígena de Pandora", 240, 2009, 4.5, jamesCameron);
        // avaliação = 6 para testar condicional
        Filme avatar = new Filme("Avatar", "Ação no mundo alienígena de Pandora", 240, 2009, 6, jamesCameron);



        Diretor christopherNolan = new Diretor("Christopher Nolan", 60, 10, Genero.MASCULINO);

        Ator christianBale = new Ator("Christian Bale", 40,3, Genero.MASCULINO);

        // Filme batman = new Filme("Batman: O Cavaleiro das Trevas", "Filme do Batman", 270, 2008,4.5, christopherNolan);
        // nome="O Clube da Luta" para testar condicional
        Filme batman = new Filme("O Clube da Luta", "Filme do Batman", 270, 2008,4.5, christopherNolan);


        /* primeira parte do exercício
        System.out.println(avatar.reproduzir());

        System.out.println(batman.reproduzir());
        **/

        /* imprimindo informações dos diretores e atores
        System.out.println(jamesCameron.getInformacao());
        System.out.println(zoeSaldana.getInformacao());

        System.out.println(christopherNolan.getInformacao());
        System.out.println(christianBale.getInformacao());
        */

        //teste do condicional da avaliação
        System.out.println(avatar.getAvaliacao());
        System.out.println(batman.getAvaliacao());

    }

}
