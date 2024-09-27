package com.softelse.src.GassociacaoAtividades.dominio;

public class Aluno {
    private String nome;
    private Nota notas;

    public void imprime(){
        if (notas == null)return;
            System.out.println("-Primeira Nota: " + notas.getPrimeiraNota());
            System.out.println("-Segunda Nota: " + notas.getSegundaNota());
            System.out.println("-Terceira Nota: " + notas.getTerceiraNota());
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, Nota notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nota getNotas() {
        return notas;
    }

    public void setNotas(Nota notas) {
        this.notas = notas;
    }
}
