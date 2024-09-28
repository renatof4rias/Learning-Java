package com.softelse.src.GassociacaoAtividades.test;

import java.util.Scanner;

public class LeituraTeclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite M ou F para seu sexo: ");
        char sexo = sc.next().charAt(0);
        System.out.println("----------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: "  + idade);
        System.out.println("Sexo: " + sexo);

        sc.close();
    }
}
