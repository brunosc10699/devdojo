package com.bruno.exercicio;

import com.bruno.exercicio.domain.Car;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "X6", 2022);

        Car car2 = new Car();
        car2.setName("Audi");
        car2.setModel("RS8");
        car2.setYearOfManufacture(2022);

        System.out.println(car1);

        System.out.println(car2);

        if (car1.equals(car2))
            System.out.println("\nO primeiro carro é IGUAL ao segundo.");
        else
            System.out.println("\nO primeiro carro é DIFERENTE do segundo.");
    }
}
