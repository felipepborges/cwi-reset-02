package exercicio.um;

import java.util.ArrayList;
import java.util.Locale;
import java.util.List;

public class Filme {

    private String nome;
    private String descricao;
    private int duracao;
    private int anoDeLancamento;
    private double avaliacao;
    private Diretor diretor;
    private List<Pessoa> elenco;

    public Filme(String nome, String descricao, int duracao, int anoDeLancamento, double avaliacao, Diretor diretor, List elenco) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.anoDeLancamento = anoDeLancamento;
        defineAvaliacao(avaliacao);
        this.diretor = diretor;
        this.elenco = elenco;

    }

    public String reproduzir() {
        return "Nome: " + this.nome.toUpperCase(Locale.ROOT) +
                "\nDescrição: " + this.descricao +
                "\nDuração: " + this.duracao + " min" +
                "\nDiretor: " + this.diretor.getNome() + "\n";
    }

    public void exibirCreditos(){
        System.out.println("ELENCO: \n");
        for(Pessoa elenco : elenco){
            System.out.println(elenco.getInformacao());
        }
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
