package com.softelse.src.GassociacaoAtividades.dominio;

import java.util.Arrays;

public class Turma {
    private String curso;
    private Aluno[] alunos;

    public void imprime(){
        System.out.println("Nome do Curso - " + this.curso);
        System.out.println("Lista de Alunos - ");
        if (alunos == null)return;
        for (Aluno aluno : alunos) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Nome - " + aluno.getNome());
            aluno.imprime();
        }

    }

    public Turma(String curso) {
        this.curso = curso;
    }

    public Turma(String curso, Aluno[] alunos) {
        this.curso = curso;
        this.alunos = alunos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

}
