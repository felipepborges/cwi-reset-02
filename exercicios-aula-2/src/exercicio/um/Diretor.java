package exercicio.um;

public class Diretor extends Pessoa {

    private int quantidadeFilmesDirigidos;


    public Diretor(String nome, int idade, int quantidadeFilmesDirigidos, Genero genero) {
        super(nome, idade, genero);
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
    }

    public String getInformacao(){
        return super.getInformacao() +
                "Número de filmes dirigidos: " + quantidadeFilmesDirigidos + "\n";
    }

}
