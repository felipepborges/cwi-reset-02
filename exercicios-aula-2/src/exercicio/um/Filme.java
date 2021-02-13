package exercicio.um;

public class Filme {

    private String nome;
    private String descricao;
    private int duracao;
    private int anoDeLancamento;
    private double avaliacao;
    private Diretor diretor;

    public Filme(String nome, String descricao, int duracao, int anoDeLancamento, double avaliacao, Diretor diretor) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.anoDeLancamento = anoDeLancamento;
        this.avaliacao = avaliacao;
        this.diretor = diretor;
    }

    public String reproduzir() {
        return "Nome: " + nome +
                "\nDescrição: " + descricao +
                "\nDuração: " + duracao +
                "\nDiretor: " + diretor.getNome() + "\n";
    }
}
