package com.bruno.exercicio.domain;

public class Calculator {

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
}
