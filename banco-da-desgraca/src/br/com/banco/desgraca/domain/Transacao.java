package br.com.banco.desgraca.domain;

import br.com.banco.desgraca.Data;

import java.time.LocalDate;

import java.text.DecimalFormat;

public class Transacao {

    private TipoTransacao tipoTransacao;
    private LocalDate dataTransacao;
    private Double valorTransacao;

    public Transacao(TipoTransacao tipoTransacao, Double valorTransacao) {
        this.tipoTransacao = tipoTransacao;
        this.valorTransacao = valorTransacao;
        this.dataTransacao = Data.getDataTransacao();
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }


    public Double getValorTransacao() {
        return valorTransacao;
    }

    public String exibeInformacoesTransacaoSemData(){
        return tipoTransacao.getNome() + " no valor de " + DecimalFormat.getCurrencyInstance().format(valorTransacao);
    }
}
