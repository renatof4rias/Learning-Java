package com.softelse.src.Gassociacao.test;

import com.softelse.src.Gassociacao.dominio.Escola;
import com.softelse.src.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Eu");
        Professor professor1 = new Professor("TU");

        Escola escola = new Escola("AQUI");

        Professor[] professores = {professor, professor1};

        escola.setProfessores(professores);

        escola.imprime();

    }
}