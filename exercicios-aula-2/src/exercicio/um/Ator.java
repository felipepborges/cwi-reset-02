package exercicio.um;

public class Ator extends Pessoa{

    private int numeroOscarsVencidos;

    public Ator(String nome, int idade, int numeroOscarsVencidos, Genero genero) {
        super(nome, idade, genero);
        this.numeroOscarsVencidos = numeroOscarsVencidos;
    }



    public String getInformacao(){
        return super.getInformacao() +
                "Número de Oscars Vencidos: " + numeroOscarsVencidos + "\n";
    }

}
