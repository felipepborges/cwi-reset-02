package exercicio.um;

import java.util.Locale;

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
        defineAvaliacao(avaliacao);
        this.diretor = diretor;

    }

    public String reproduzir() {
        return "Nome: " + this.nome.toUpperCase(Locale.ROOT) +
                "\nDescrição: " + this.descricao +
                "\nDuração: " + this.duracao + " min" +
                "\nDiretor: " + this.diretor.getNome() + "\n";
    }

    public void defineAvaliacao(double avaliacao){
        if(nome.equalsIgnoreCase("O Clube da Luta")) {
            this.avaliacao = 5;
        } else if(nome.equalsIgnoreCase("Batman vs Superman")) {
            this.avaliacao = 1;
        }else if(avaliacao >= 1 && avaliacao <=5){
            this.avaliacao=avaliacao;
        } else{
            this.avaliacao = 3;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getAvaliacao() {
        return avaliacao;
    }
}
