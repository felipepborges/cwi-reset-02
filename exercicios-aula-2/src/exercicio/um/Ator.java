package exercicio.um;

import java.time.LocalDate;

public class Ator extends Pessoa{

    private int numeroOscarsVencidos;

    public Ator(String nome, LocalDate dataNascimento, int numeroOscarsVencidos, Genero genero) {
        super(nome, dataNascimento, genero);
        this.numeroOscarsVencidos = numeroOscarsVencidos;
    }



    public String getInformacao(){
        return super.getInformacao() +
                "Número de Oscars Vencidos: " + numeroOscarsVencidos + "\n";
    }

}
