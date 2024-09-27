package com.softelse.src.GassociacaoAtividades.dominio;

public class Garagem {
    private String dono;
    private int capacidade;

    public Garagem() {
    }

    public Garagem(String dono) {
        this.dono = dono;
    }

    public Garagem(String dono, int capacidade) {
        this.dono = dono;
        this.capacidade = capacidade;
    }


    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }


}
