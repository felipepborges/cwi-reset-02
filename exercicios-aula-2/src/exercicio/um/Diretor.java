package exercicio.um;

public class Diretor {
    private String nome;
    private int idade;
    private int quantidadeFilmesDirigidos;
    private Genero genero;

    public Diretor(String nome, int idade, int quantidadeFilmesDirigidos, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
        this.genero = genero;
    }
    public String getNome() {
        return nome;
    }

    public String informacoesDiretor(){
        return "Nome do diretor: " + this.nome +
                "\nIdade: " + this.idade + " anos" +
                "\nGênero: " + this.genero.toString() + "\n";
    }
}
