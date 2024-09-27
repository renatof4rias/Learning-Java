package com.softelse.src.GassociacaoAtividades.dominio;

public class Partida {
    private String tipo;
    private Jogadores[] jogadores;

    public void imprimir(){
        System.out.println("***Partida *** Encontrada***");
        System.out.println("Tipo:" + this.tipo);
        if (jogadores == null)return;
        System.out.println("Jogadores: ");
        for (Jogadores jogador : jogadores) {
            System.out.println("-----------------------------------------");
            System.out.println("Nick - " + jogador.getApelido());
            System.out.println("Rota -- " + jogador.getRota());
            System.out.println("Selected --- " + jogador.getNomeCampeao());
            System.out.println("-----------------------------------------");
        }
    }

    public Partida(String tipo) {
        this.tipo = tipo;
    }

    public Partida(String tipo, Jogadores[] jogadores) {
        this.tipo = tipo;
        this.jogadores = jogadores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Jogadores[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogadores[] jogadores) {
        this.jogadores = jogadores;
    }
}
