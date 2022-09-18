package com.bruno.exercicio;

import com.bruno.exercicio.domain.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.sumTwoNumbers(8.7, 7.9);

        calculator.subtractingBetweenTwoNumbers(9.3, 6.2);

        calculator.multiplyingTwoNumbers(9d, 7.1);

        calculator.dividingTwoNumbers(10d, 0d);

        calculator.dividingTwoNumbers(0d, 10d);

        calculator.dividingTwoNumbers(5d, 7d);
    }
}
