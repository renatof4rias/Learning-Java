package com.softelse.src.GassociacaoAtividades.test;

import java.util.Scanner;

public class LeituraMedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double[] notas = new Double[3];
        System.out.println("PREENCHA OS DADOS DO ALUNO");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) +  "o Semestre: ");
            notas[i] = sc.nextDouble();
        }


        for (Double nota : notas) {
            System.out.println(nota);
        }
        sc.close();
    }
}
