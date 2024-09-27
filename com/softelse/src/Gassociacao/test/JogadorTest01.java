package com.softelse.src.Gassociacao.test;

import com.softelse.src.Gassociacao.dominio.Jogador;
import com.softelse.src.Gassociacao.dominio.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafú");
        Time time = new Time("Brasil");

        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);

        Jogador[] jogadores = {jogador1, jogador2, jogador3};


        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }


    }
}
