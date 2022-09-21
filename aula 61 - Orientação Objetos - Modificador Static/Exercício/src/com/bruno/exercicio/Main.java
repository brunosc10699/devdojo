package com.bruno.exercicio;

import com.bruno.exercicio.domain.Car;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Chevrolet", 210f);
        Car car2 = new Car("Fiat", 190f);
        Car car3 = new Car("Volkswagen", 250f);

        System.out.printf("%n%nVelocidade limite: %s Km/h", Car.speedLimit);

        printCars(car1, car2, car3);

        Car.speedLimit = 300f;
        System.out.printf("%n%nVelocidade limite: %s Km/h", Car.speedLimit);

        printCars(car1, car2, car3);
    }

    private static void printCars(Car car1, Car car2, Car car3) {
        car1.printCarData();
        car2.printCarData();
        car3.printCarData();
    }
}
