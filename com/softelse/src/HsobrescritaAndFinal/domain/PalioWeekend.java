package com.softelse.src.HsobrescritaAndFinal.domain;

public final class PalioWeekend extends Palio{

    public static final int VELOCIDADE_MAX = 200;

    public PalioWeekend() {
    }

    public PalioWeekend(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public String toString() {
        return "PalioWeekend{} " + super.toString();
    }
}