package exercicio.um;

public class Pessoa {

    private String nome;
    private int idade;
    private Genero genero;

    public Pessoa(String nome, int idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public String getInformacao(){
        return "Nome: " + this.nome +
                "\nIdade: " + this.idade + " anos" +
                "\nGênero: " + this.genero.toString() + "\n";
    }

    public String getNome() {
        return nome;
    }
}
