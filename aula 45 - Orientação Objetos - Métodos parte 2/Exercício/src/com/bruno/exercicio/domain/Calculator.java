package com.bruno.exercicio.domain;

public class Calculator {

    public void sumTwoNumbers(double number1, double number2) {
        double result = number1 + number2;
        System.out.printf("%nA soma entre %.2f e %.2f é %.2f", number1, number2, result);
    }

    public void subtractingBetweenTwoNumbers(double number1, double number2) {
        double result = number1 - number2;
        System.out.printf("%nA diferença entre %.2f e %.2f é %.2f", number1, number2, result);
    }

    public void multiplyingTwoNumbers(double number1, double number2) {
        double result = number1 * number2;
        System.out.printf("%nO produto da multiplicação entre %.2f e %.2f é %.2f", number1, number2, result);
    }

    public void dividingTwoNumbers(double number1, double number2) {
        if (number2 == 0) {
            System.out.printf("%nNão é possível dividir %.2f por 0 (Zero)!", number1);
        } else {
            double result = number1 / number2;
            System.out.printf("%nO resultado da divisão entre %.2f e %.2f é %.2f", number1, number2, result);
        }
    }
}
