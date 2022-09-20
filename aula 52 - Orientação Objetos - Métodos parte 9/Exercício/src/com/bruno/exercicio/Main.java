package com.bruno.exercicio;

import com.bruno.exercicio.domain.Calculator;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        Calculator calculator = new Calculator();

        calculator.sumArrayNumbers(10.5, 3, 4L, 37.984);

        calculator.sumArrayNumbers(5.7, 9.18, 3.141516, 873.7, 32.6, 19.45, 3);

        int counter;
        do {
            counter = random.nextInt(10);
        } while (counter < 2);

        double[] numbers = new double[counter];

        for (int index = 0; index < counter; index++)
            numbers[index] = Math.random() * 10;

        calculator.sumArrayNumbers(numbers);

        calculator.sumArrayNumbers("Hello Varargs...", numbers);

        calculator.sumArrayNumbers(1.0, 3.1, 4.5, 7L, 3.5f, 8, 9.3);

        sumArrayNumbers("Hello varargs...", 1.0, 3.1, 4.5, 7L, 3.5f, 8, 9.3);

    }
    public static void sumArrayNumbers(String greeting, double... numbers) {
        double result = 0d;
        for(double number : numbers) result += number;
        System.out.printf("%n%s%nO resultado da SOMA dos números enviados no array %s é %.2f",
                greeting, Arrays.toString(numbers), result);
    }
}
