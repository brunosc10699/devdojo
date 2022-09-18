package com.bruno.exercicio;

import com.bruno.exercicio.domain.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.sumTwoNumbers(8.7, 7.9));

        System.out.println(calculator.subtractingBetweenTwoNumbers(9.3, 6.2));

        System.out.println(calculator.multiplyingTwoNumbers(9d, 7.1));

        System.out.println(calculator.dividingTwoNumbers(10d, 0d));

        System.out.println(calculator.dividingTwoNumbers(0d, 10d));

        System.out.println(calculator.dividingTwoNumbers(5d, 7d));
    }
}
