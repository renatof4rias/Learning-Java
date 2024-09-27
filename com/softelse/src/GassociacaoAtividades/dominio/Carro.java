package com.softelse.src.GassociacaoAtividades.dominio;

public class Carro {
    private String modelo;
    private Garagem garagem;

    public void imprime(){
        System.out.println("-----------------");
        System.out.println("Modelo do Carro: " + this.modelo);
    }

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public Carro(String modelo, Garagem garagem) {
        this.modelo = modelo;
        this.garagem = garagem;

    }

    public Garagem getGaragem() {
        return garagem;
    }

    public void setGaragem(Garagem garagem) {
        this.garagem = garagem;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
