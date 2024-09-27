package com.softelse.src.Gassociacao.test;

import com.softelse.src.Gassociacao.dominio.Jogador;
import com.softelse.src.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Wizer");
        Jogador jogador1 = new Jogador("Carioka");
        Jogador jogador2 = new Jogador("Dynkedo");

        Jogador[] jogadores = {jogador, jogador1, jogador2};

        Time time = new Time("Pain Gomes", jogadores);


        time.imprimir();




    }
}
