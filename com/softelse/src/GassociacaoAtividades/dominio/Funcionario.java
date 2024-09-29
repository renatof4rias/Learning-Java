package com.softelse.src.GassociacaoAtividades.dominio;

public class Funcionario extends Pessoa{

    public Funcionario(String nome) {
        super(nome);

        System.out.println("a");
    }

    public Funcionario(String nome, String sobrenome ) {
        super(nome, sobrenome);
        System.out.println("b");
    }

}
