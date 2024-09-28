package com.softelse.src.GassociacaoAtividades.test;

import com.softelse.src.GassociacaoAtividades.dominio.Aluno;
import com.softelse.src.GassociacaoAtividades.dominio.Local;
import com.softelse.src.GassociacaoAtividades.dominio.Professor;
import com.softelse.src.GassociacaoAtividades.dominio.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {

        Local local = new Local("RUA A ");
        Aluno aluno = new Aluno("Ruan", 17);
        Professor professor = new Professor("ABCD", "EFGH");
        Seminario seminario = new Seminario("DCBA");


        aluno.setSeminario(seminario);
        Aluno[] alunos = {aluno};
        seminario.setAlunos(alunos);
        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);
        seminario.setLocal(local);


    }
}
