package com.softelse.src.Jpolimorfismo.test;

import com.softelse.src.Jpolimorfismo.domain.Computador;
import com.softelse.src.Jpolimorfismo.domain.Tomate;
import com.softelse.src.Jpolimorfismo.service.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Nitro 5", 4800.00);
        Tomate tomate = new Tomate("Tomate", 5.00);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);


    }
}
