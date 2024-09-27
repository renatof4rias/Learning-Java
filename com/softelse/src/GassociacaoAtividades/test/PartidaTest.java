package com.softelse.src.GassociacaoAtividades.test;
import com.softelse.src.GassociacaoAtividades.dominio.Jogadores;
import com.softelse.src.GassociacaoAtividades.dominio.Partida;

public class PartidaTest {
    public static void main(String[] args) {
        Jogadores jogador = new Jogadores("Wizer", "Jax", "Topo");
        Jogadores jogador1 = new Jogadores("Carioka", "Lee Sin", "Selva");
        Jogadores jogador2 = new Jogadores("Dynkedo", "Ahri", "Meio");
        Jogadores jogador3 = new Jogadores("TitaN", "Lucian", "Atirador");
        Jogadores jogador4 = new Jogadores("Kuri", "Rell", "Suporte");

        Jogadores[] jogadores = {jogador, jogador1, jogador2, jogador3, jogador4};

        Partida partida = new Partida("Flex", jogadores);

        partida.imprimir();

    }
}
