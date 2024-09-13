package com.softelse.src.assosiacao.domain;

public class Local {
    private String secao;
    private String estante;

    public Local(String secao, String estante) {
        this.secao = secao;
        this.estante = estante;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }


    public String getEstante() {
        return estante;
    }

    public void setEstante(String estante) {
        this.estante = estante;
    }
}