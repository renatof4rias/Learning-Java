package com.softelse.src.GassociacaoAtividades.dominio;

public class Pessoa {
    private String nome;
    private String sobrenome;


    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("c");
    }

    public Pessoa(String nome, String sobrenome) {
        this(nome);
        this.sobrenome = sobrenome;
        System.out.println("d");
    }
}
