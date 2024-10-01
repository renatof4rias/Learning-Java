package com.softelse.src.Ienum.domain;

public enum TipoCartao {

    CREDITO(1, "Crédito") {
        private double limiteCartao = 0.0;

        @Override
        public double setLimiteCredito(double limite) {
            return limiteCartao = limite;
        }

        @Override
        public double getLimiteCredito() {
            return limiteCartao;
        }
    },
    DEBITO(2, "Débito") {
        private double limiteCartao = 0.0;

        @Override
        public double setLimiteCredito(double limite) {
            return limiteCartao = 0.0;
        }

        @Override
        public double getLimiteCredito() {
            return limiteCartao;
        }
    };

    public int valor;
    public static int valor1;
    public String nomeRelatorio;

    TipoCartao(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public void atualizarValor1() {
        valor1 = this.valor;
    }

    public static TipoCartao getNomeTipoCartao(String nomeRelatorio) {
        for (TipoCartao tipoCartao : values()) {
            if (tipoCartao.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCartao;
            }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }

    public abstract double setLimiteCredito(double limit);
    public abstract double getLimiteCredito();
}