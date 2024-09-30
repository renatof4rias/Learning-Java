package com.softelse.src.HsobrescritaAndFinal.test;

import com.softelse.src.HsobrescritaAndFinal.domain.Carro;
import com.softelse.src.HsobrescritaAndFinal.domain.Palio;
import com.softelse.src.HsobrescritaAndFinal.domain.PalioWeekend;

public class CarroTest {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        Carro carro = new Carro("Generico", 2020);
        System.out.println(carro.toString());
        System.out.println("-------------------------------------------------");
        Palio palio = new Palio("Palio Fire", 2021);
        System.out.println(palio.toString());
        System.out.println("-------------------------------------------------");
        PalioWeekend palioWeekend = new PalioWeekend("Palio Weekend", 2022);
        System.out.println(palioWeekend.toString());
        System.out.println("-------------------------------------------------");

    }
}