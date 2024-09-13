package com.softelse.src.heranca.domain;

public class Funcionario extends Pessoa{

    private double salario;


    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salario = " + this.getSalario());
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
