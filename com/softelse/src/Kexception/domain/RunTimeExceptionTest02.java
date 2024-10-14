package com.softelse.src.Kexception.domain;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {

        divisao(1, 0);


    }

    private static int divisao(int a, int b){

        return a/b;
    }
}
