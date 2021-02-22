package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.ContaBancaria;
import br.com.banco.desgraca.domain.conta.ContaCorrente;
import br.com.banco.desgraca.domain.conta.ContaDigital;
import br.com.banco.desgraca.domain.conta.ContaPoupanca;

import java.time.LocalDate;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        ContaCorrente contaCorrenteBradesco = new ContaCorrente(7777, InstituicaoBancaria.BRADESCO);

        ContaPoupanca conta = new ContaPoupanca(123, contaCorrenteBradesco);

        ContaPoupanca conta2 = new ContaPoupanca(456,444, InstituicaoBancaria.BANCO_DO_BRASIL);

        conta.depositar(100.00);
        conta.sacar(50.00); // - R$1 de taxa
        conta.depositar(1000.00);
        conta.transferir(250.00, conta2); //-R$2.5 de taxa

        LocalDate data1 = LocalDate.of(2020, 06, 8);
        LocalDate data2 = LocalDate.of(2020, 07, 18);

        conta.exibirExtrato(data1, data2);
        conta2.exibirExtrato(data1, data2);
        System.out.println(conta.consultarSaldo());


    }

}
