package com.bruno.exercicio;

public class Main {

    public static void main(String[] args) {

        System.out.println("Números pares de 0 a 20");

        for (byte i = 0; i <= 20; i++) {
            if (i % 2 == 1) continue;
            System.out.println(i);
        }
    }
}
