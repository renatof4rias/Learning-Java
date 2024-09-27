package com.softelse.src.GassociacaoAtividades.dominio;

public class Nota {
    private int primeiraNota;
    private int segundaNota;
    private int terceiraNota;

    public Nota(int primeiraNota, int segundaNota, int terceiraNota) {
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
        this.terceiraNota = terceiraNota;
    }

    public int getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(int primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public int getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(int segundaNota) {
        this.segundaNota = segundaNota;
    }

    public int getTerceiraNota() {
        return terceiraNota;
    }

    public void setTerceiraNota(int terceiraNota) {
        this.terceiraNota = terceiraNota;
    }

}