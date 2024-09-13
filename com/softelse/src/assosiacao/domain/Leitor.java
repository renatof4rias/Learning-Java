package com.softelse.src.assosiacao.domain;

public class Leitor {
    private String nome;
    private int idade;

    private Livro[] livros;

    public Leitor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Leitor(String nome, int idade, Livro[] livros) {
        this.nome = nome;
        this.idade = idade;
        this.livros = livros;
    }

    public void imprime(){
        System.out.println("*** Ficha do Leitor ***");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println();
        if (this.livros==null) return;
        System.out.println("**** Livros Em Uso ****");
        for (Livro livro : livros) {
            System.out.println();
            System.out.println("Livro: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor().getNome());
            System.out.println("Local: Seção = " + livro.getLocal().getSecao() + " - " + " Estante = " + livro.getLocal().getEstante());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
}