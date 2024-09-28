package com.softelse.src.GassociacaoAtividades.test;

import com.softelse.src.GassociacaoAtividades.dominio.Produto;

import java.util.Scanner;

public class LeituraDificil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = null;

        System.out.println("Selecione uma Opção");
        System.out.println("1- Cadastrar");
        System.out.println("2- Consultar");
        System.out.println("3- Editar");
        System.out.println("4- Remover");
        System.out.println("5- Sair");
        int opcao = sc.nextInt();
        sc.nextLine();

        while (opcao != 5) {
            if (opcao == 1) {
                produto = new Produto();
                System.out.println("** Cadastrar Produto **");
                System.out.print("Nome: ");
                produto.setNome(sc.nextLine());
                System.out.print("Preço: ");
                produto.setPreco(sc.nextDouble());
            } else if (opcao == 2) {
                if (produto == null) {
                    System.out.println("Sem Itens Listados");
                }else {
                    System.out.println("Lista de Produtos");
                    System.out.println(produto.getNome() + " - R$" + produto.getPreco());
                }
            } else if (opcao == 3) {
                if (produto == null) {
                    System.out.println("Sem Itens Listados");
                }else {
                    System.out.println("** Editar Produto **");
                    System.out.print("Nome: ");
                    produto.setNome(sc.nextLine());
                    System.out.print("Preço: ");
                    produto.setPreco(sc.nextDouble());
                }
            } else if (opcao == 4) {
                if (produto == null) {
                    System.out.println("Sem Itens");
                } else{
                    produto = null;
                    System.out.println("Removido");
                }
            }
            System.out.println();
            System.out.println("Selecione uma Opção");
            System.out.println("1- Cadastrar");
            System.out.println("2- Consultar");
            System.out.println("3- Editar");
            System.out.println("4- Remover");
            System.out.println("5- Sair");
            opcao = sc.nextInt();
            sc.nextLine();
        }
        if (opcao == 5) {
            System.out.println("Encerrando o Sistema");
            return;
        }
        sc.close();
    }
}