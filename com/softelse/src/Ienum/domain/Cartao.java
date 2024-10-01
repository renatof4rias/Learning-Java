package com.softelse.src.Ienum.domain;

public class Cartao {
    private String nomeTitular;
    private TipoCartao tipoCartao;

    public Cartao() {
    }

    public Cartao(String nomeTitular, TipoCartao tipoCartao, double limiteCredito) {
        this.nomeTitular = nomeTitular;
        this.tipoCartao = tipoCartao;
        tipoCartao.setLimiteCredito(limiteCredito);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public TipoCartao getTipoCartao() {
        return tipoCartao;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", tipoCartao=" + tipoCartao + '\'' +
                ", tipoCartao(Valor)=" + tipoCartao.valor + '\'' +
                ", limiteCartao=" + tipoCartao.getLimiteCredito()+
                '}';
    }
}