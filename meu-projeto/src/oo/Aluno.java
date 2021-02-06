package oo;

import java.text.DecimalFormat;

public class Aluno {

    private String nomeAluno;
    private double notaFinal;
    private boolean situacaoAluno;

    DecimalFormat df = new DecimalFormat("#,###.00"); // Adicionei essa formatação para a nota final sair somente com duas casas decimais

    public Aluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    // método que retorna a nota média das notas e verifica a situação de aprovação do aluno
    public double calculaNotaFinal(double [] notas){
        double somaNotas=0;
        for(int i = 0; i < notas.length; i++){
            somaNotas += notas[i];
        }
        notaFinal = somaNotas/notas.length;

        if(notaFinal >= 7){
            situacaoAluno = true;
        } else {
            situacaoAluno = false;
        }
        return notaFinal;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public boolean isSituacaoAluno() {
        return situacaoAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    // método para mudar a nota final do aluno atualizando a situação de aprovação
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
        if(notaFinal >= 7){
            situacaoAluno = true;
        } else {
            situacaoAluno = false;
        }
    }

    public String toString() {
        return  "Nome do aluno = " + nomeAluno +
                "\nNota final = " + df.format(notaFinal) +
                "\nAprovado = " + situacaoAluno +"\n";
    }
}
