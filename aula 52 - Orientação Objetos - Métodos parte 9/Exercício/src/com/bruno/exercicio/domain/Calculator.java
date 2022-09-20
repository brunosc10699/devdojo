package com.bruno.exercicio.domain;

import java.util.Arrays;
import java.util.Random;

public class Calculator {

    private final Random random = new Random();

    public void sumArrayNumbers(double... numbers) {
        double result = 0d;
        for(double number : numbers) result += number;
        System.out.printf("%nO resultado da SOMA dos números enviados no array %s é %.2f",
                Arrays.toString(numbers), result);
    }

    public void sumArrayNumbers(String greeting, double... numbers) {
        double result = 0d;
        for(double number : numbers) result += number;
        System.out.printf("%n%s%nO resultado da SOMA dos números enviados no array %s é %.2f",
                greeting, Arrays.toString(numbers), result);
    }

    public String sumTwoNumbers(double number1, double number2) {
        double result = number1 + number2;
        return String.format("%nA soma entre %.2f e %.2f é %.2f", number1, number2, result);
    }

    public String subtractingBetweenTwoNumbers(double number1, double number2) {
        double result = number1 - number2;
        return String.format("%nA diferença entre %.2f e %.2f é %.2f", number1, number2, result);
    }

    public String multiplyingTwoNumbers(double number1, double number2) {
        double result = number1 * number2;
        return String.format("%nO produto da multiplicação entre %.2f e %.2f é %.2f", number1, number2, result);
    }

    public String dividingTwoNumbers(double number1, double number2) {
        if (number2 == 0)
            return String.format("%nNão é possível dividir %.2f por 0 (Zero)!", number1);

        double result = number1 / number2;
        return String.format("%nO resultado da divisão entre %.2f e %.2f é %.2f", number1, number2, result);
    }

    public void printTheResultOfDividingTwoNumbers(double number1, double number2) {
        if (number2 == 0) {
            System.out.printf("%nNão é possível dividir %.2f por 0 (Zero)!%n", number1);
            return;
        }
        double result = number1 / number2;
        System.out.printf("%nO resultado da divisão entre %.2f e %.2f é %.2f%n", number1, number2, result);
    }

    public void changeNumberValue(int number1, int number2) {
        number1 = random.nextInt(51);
        number2 = random.nextInt(71);

        System.out.println("\nNúmero1 e Número2 DENTRO do método que muda o valor dos parâmetros:");
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
    }
}

