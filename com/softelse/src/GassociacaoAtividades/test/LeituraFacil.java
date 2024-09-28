package com.softelse.src.GassociacaoAtividades.test;

import java.util.Scanner;

public class LeituraFacil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PREENCHA OS CAMPOS ABAIXO");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();


        System.out.println("-------------------------------------------");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println("-------------------------------------------");


        sc.close();
    }
}
