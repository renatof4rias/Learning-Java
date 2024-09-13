package com.softelse.src.assosiacao.test;

import com.softelse.src.assosiacao.domain.Autor;
import com.softelse.src.assosiacao.domain.Leitor;
import com.softelse.src.assosiacao.domain.Livro;
import com.softelse.src.assosiacao.domain.Local;

public class Biblioteca {
    public static void main(String[] args) {


        Local local = new Local("Pateleira A", "Gaveta 33");
        Local local1 = new Local("Pateleira A", "Gaveta 34");
        Autor autor = new Autor("Growth", "Brasileira");
        Autor autor1 = new Autor("MAX", "Brasileira");
        Livro livro = new Livro("Jogador N1", 2017, autor, local);
        Livro livro1 = new Livro("Jogador N2", 2018, autor1, local1);

        Livro[] livros = {livro, livro1};
        Leitor leitor = new Leitor("Toguro", 34, livros);

        leitor.imprime();
    }
}