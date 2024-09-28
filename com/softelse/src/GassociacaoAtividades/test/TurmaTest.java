package com.softelse.src.GassociacaoAtividades.test;

import com.softelse.src.GassociacaoAtividades.dominio.Aluno1;
import com.softelse.src.GassociacaoAtividades.dominio.Nota;
import com.softelse.src.GassociacaoAtividades.dominio.Turma;

public class TurmaTest {
    public static void main(String[] args) {

        Nota nota = new Nota(10, 9, 8);
        Nota nota1 = new Nota(7, 6, 5);
        Nota nota2 = new Nota(4, 3, 2);

        Aluno1 aluno = new Aluno1("Renato", nota);
        Aluno1 aluno1 = new Aluno1("Luiza", nota1);
        Aluno1 aluno2 = new Aluno1("Helena", nota2);

        Aluno1[] alunos = {aluno, aluno1, aluno2};

        Turma turma = new Turma("Java", alunos);
        turma.imprime();
        System.out.println("----------------------------------------------------------");
    }
}