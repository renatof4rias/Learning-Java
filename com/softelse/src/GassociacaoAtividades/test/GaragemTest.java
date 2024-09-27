package com.softelse.src.GassociacaoAtividades.test;

import com.softelse.src.GassociacaoAtividades.dominio.Carro;
import com.softelse.src.GassociacaoAtividades.dominio.Garagem;

public class GaragemTest {
    public static void main(String[] args) {

        Garagem garagem = new Garagem("Renato", 2);
        Carro carro = new Carro("911 Turbo S", garagem);
        Carro carro2 = new Carro("911 GT3 RS", garagem);



        carro.imprime();
        carro2.imprime();

    }
}
