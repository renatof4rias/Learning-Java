package com.softelse.src.Jpolimorfismo.service;

import com.softelse.src.Jpolimorfismo.domain.Computador;
import com.softelse.src.Jpolimorfismo.domain.Produto;
import com.softelse.src.Jpolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relátorio de imposto do computador");
        double imposto =  computador.calcularImposto();
        System.out.println("Computador " + computador.getNome());
        System.out.println("Valor " + computador.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relátorio de imposto do tomate");
        double imposto =  tomate.calcularImposto();
        System.out.println("Tomate " + tomate.getNome());
        System.out.println("Valor " + tomate.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }

    public static void calcularImposto(Produto produto){
        System.out.println("Relátorio de imposto");
        double imposto =  produto.calcularImposto();
        System.out.println("Produto " + produto.getNome());
        System.out.println("Valor " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }

}
