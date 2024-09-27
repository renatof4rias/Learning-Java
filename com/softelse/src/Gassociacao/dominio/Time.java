package com.softelse.src.Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public void imprimir(){
        System.out.println("Time: " + this.getNome());
        if(jogadores == null)return;
        for (Jogador jogador : jogadores) {
            System.out.println("Jogador: " + jogador.getNome());
        }
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}