package oo;

public class Calculadora {

    double valor1;
    double valor2;

    public double soma(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
        return valor1 + valor2;
    }

    public double subtrai(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
        return valor1 - valor2;
    }

    public double multiplica(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
        return valor1 * valor2;
    }

    public double divide(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
        return valor1 / valor2;
    }

    public double getValor1() {
        return valor1;
    }

    public double getValor2() {
        return valor2;
    }
}
