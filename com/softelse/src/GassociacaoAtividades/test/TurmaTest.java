package com.softelse.src.GassociacaoAtividades.test;

import com.softelse.src.GassociacaoAtividades.dominio.Aluno;
import com.softelse.src.GassociacaoAtividades.dominio.Nota;
import com.softelse.src.GassociacaoAtividades.dominio.Turma;

public class TurmaTest {
    public static void main(String[] args) {

        Nota nota = new Nota(10,9,8);
        Nota nota1 = new Nota(7,6,5);
        Nota nota2 = new Nota(4,3,2);

        Aluno aluno = new Aluno("Renato",nota);
        Aluno aluno1 = new Aluno("Luiza",nota1);
        Aluno aluno2 = new Aluno("Helena",nota2);

        Aluno[] alunos = {aluno, aluno1, aluno2};

        Turma turma = new Turma("Java", alunos);


        turma.imprime();
        System.out.println("----------------------------------------------------------");

    }
}
