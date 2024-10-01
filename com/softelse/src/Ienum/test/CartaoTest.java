package com.softelse.src.Ienum.test;

import com.softelse.src.Ienum.domain.Cartao;
import com.softelse.src.Ienum.domain.TipoCartao;

public class CartaoTest {
    public static void main(String[] args) {
        Cartao cartao = new Cartao("Renato", TipoCartao.CREDITO, 500);
        Cartao cartao1 = new Cartao("Snow", TipoCartao.DEBITO, 1000);

        System.out.println("---------------------------------");
        TipoCartao crédito = TipoCartao.getNomeTipoCartao("Crédito");
        System.out.println(crédito);
        System.out.println("---------------------------------");

//        System.out.println("---------------------------------");
//        System.out.println(cartao);
//        System.out.println("---------------------------------");
//        System.out.println("---------------------------------");
//        System.out.println(cartao1);
//        System.out.println("---------------------------------");
    }
}