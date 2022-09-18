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
}
