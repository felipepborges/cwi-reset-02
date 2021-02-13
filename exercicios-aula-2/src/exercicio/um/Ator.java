package exercicio.um;

public class Ator {

    private String nome;
    private int idade;
    private int numeroOscarsVencidos;
    private Genero genero;

    public Ator(String nome, int idade, int numeroOscarsVencidos, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.numeroOscarsVencidos = numeroOscarsVencidos;
        this.genero = genero;
    }

    public String informacoesAtor(){
        return "Nome do ator: " + this.nome +
                "\nIdade: " + this.idade + " anos" +
                "\nGênero: " + this.genero.toString() + "\n";
    }


}
