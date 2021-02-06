package oo;

import org.w3c.dom.ls.LSOutput;

public class Aplicacao {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double numero1 = 18;
        double numero2 = 6;

        // Soma
        double resultadoSoma = calculadora.soma(numero1, numero2);
        System.out.println(calculadora.getValor1() + " + " + calculadora.getValor2() + " = " + resultadoSoma);

        // Subtração
        double resultadoSubtracao = calculadora.subtrai(numero1, numero2);
        System.out.println(calculadora.getValor1() + " - " + calculadora.getValor2() + " = " + resultadoSubtracao);

        //Multiplicação
        double resultadoMultiplicacao = calculadora.multiplica(numero1, numero2);
        System.out.println(calculadora.getValor1() + " * " + calculadora.getValor2() + " = " + resultadoMultiplicacao);

        //Divisão
        double resultadoDivisao = calculadora.divide(numero1, numero2);
        System.out.println(calculadora.getValor1() + " / " + calculadora.getValor2() + " = " + resultadoDivisao);


        // Comparador
        int valor1 = (int) numero1;
        int valor2 = (int) numero2;
        Comparador comparador = new Comparador();

        System.out.println(valor1 + " é menor que " + valor2 + "? " + comparador.menorQue(valor1, valor2));

    }
}
