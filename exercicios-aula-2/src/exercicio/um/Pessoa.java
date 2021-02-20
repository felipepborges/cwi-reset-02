package exercicio.um;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private Genero genero;

    public Pessoa(String nome, LocalDate dataNascimento, Genero genero) {
        this.nome = nome;
        //this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public String getInformacao(){
        return "Nome: " + this.nome +
               "\nIdade: " + Period.between(this.dataNascimento, LocalDate.now()).getYears() + " anos" +
                "\nGênero: " + this.genero.toString() + "\n";
    }

    public String getNome() {
        return nome;
    }
}
