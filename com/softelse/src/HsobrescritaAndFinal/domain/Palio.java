package com.softelse.src.HsobrescritaAndFinal.domain;

public class Palio extends Carro{
    public static final int VELOCIDADE_MAX = 180;

    public Palio() {
    }

    public Palio(String modelo, int ano) {
        super(modelo, ano);
    }

    public final boolean isDuasPortas(int portas){
        if(portas == 4){
            return false;
        }else {
        return true;
        }

    }

    @Override
    public String toString() {
        return "Palio{} " + super.toString();
    }
}