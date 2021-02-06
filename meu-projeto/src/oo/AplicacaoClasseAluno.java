package oo;

public class AplicacaoClasseAluno {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Chaves");

        double [] notasAluno1 = {5.2, 8, 4.5};

        aluno1.calculaNotaFinal(notasAluno1);

        System.out.println(aluno1.toString());

        //Definindo outra nota final para o aluno1
        aluno1.setNotaFinal(10);
        System.out.println(aluno1.toString());


        //instanciando outro aluno para teste

        Aluno aluno2 = new Aluno("Seu Madruga");

        double [] notasAluno2 = {8, 9, 7.5};

        aluno2.calculaNotaFinal(notasAluno2);

        System.out.println(aluno2.toString());
        
    }
}
