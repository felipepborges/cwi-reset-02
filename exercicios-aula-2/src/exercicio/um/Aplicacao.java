package exercicio.um;

public class Aplicacao {

    public static void main(String[] args) {

        Diretor jamesCameron = new Diretor("James Cameron", 70, 10);

        Filme avatar = new Filme("Avatar", "Ação no mundo alienígena de Pandora", 240, 2009, 4.5, jamesCameron);

        Diretor christopherNolan = new Diretor("Christopher Nolan", 60, 10);

        Filme batman = new Filme("Batman: O Cavaleiro das Trevas", "Filme do Batman", 270, 2008,4.5, christopherNolan);

        System.out.println(avatar.toString());

        System.out.println(batman.toString());


    }

}
