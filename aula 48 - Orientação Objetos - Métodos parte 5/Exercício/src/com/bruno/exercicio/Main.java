package com.bruno.exercicio;

import com.bruno.exercicio.domain.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int number1 = 150;
        int number2 = 220;

        System.out.println("\nNúmero1 e Número2 ANTES da chamada do método que muda o valor dos parâmetros:");
        printParams(number1, number2);

        calculator.changeNumberValue(number1, number2);

        System.out.println("\nNúmero1 e Número2 DEPOIS da chamada do método que muda o valor dos parâmetros:");
        printParams(number1, number2);

        System.out.println(
                "\nConclusão: o valor das variáveis do tipo primitivo permanece inalterado " +
                        "quando passado como parâmetro."
        );

    }

    public static void printParams(int number1, int number2) {
        System.out.println("Number2: " + number2);
        System.out.println("Number1: " + number1);
    }
}
