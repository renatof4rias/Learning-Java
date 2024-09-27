package com.softelse.src.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime(){
        System.out.println("Jogador: " + this.nome);
        if(time == null)return;
        System.out.println("Time: " + time.getNome());
    }

    public Jogador(String nome, Time time) {
        this.nome = nome;
        this.time = time;
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}