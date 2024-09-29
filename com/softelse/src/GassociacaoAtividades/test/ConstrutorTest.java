package com.softelse.src.GassociacaoAtividades.test;

import com.softelse.src.GassociacaoAtividades.dominio.Funcionario;
import com.softelse.src.GassociacaoAtividades.dominio.Pessoa;
import com.softelse.src.GassociacaoAtividades.dominio.Professor;

public class ConstrutorTest {
    public static void main(String[] args) {

        Professor professor = new Professor();
        Professor professor1 = new Professor("Luciano", "Matematica");

//        Pessoa pessoa = new Pessoa("ABCD", "BDBAK");

        Funcionario funcionario = new Funcionario("ABCD", "BDBAK");

    }
}
