package com.bruno.exercicio;

public class Main {

    public static void main(String[] args) {

        var dayOfTheWeek = 5;

        switch (dayOfTheWeek) {
            case 1:
            case 7:
                System.out.println("Final de semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil!");
                break;
            default:
                System.out.println("O número informado não corresponde a um dia da semana!");
        }
    }
}
