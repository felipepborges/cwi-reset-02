package exercicio.um;

import java.time.LocalDate;

public class Diretor extends Pessoa {

    private int quantidadeFilmesDirigidos;


    public Diretor(String nome, LocalDate dataNascimento, int quantidadeFilmesDirigidos, Genero genero) {
        super(nome, dataNascimento, genero);
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
    }

    public String getInformacao(){
        return super.getInformacao() +
                "Número de filmes dirigidos: " + quantidadeFilmesDirigidos + "\n";
    }

}
