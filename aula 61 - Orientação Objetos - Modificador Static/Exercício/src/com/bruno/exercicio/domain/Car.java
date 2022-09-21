package com.bruno.exercicio.domain;

public class Car {

    private String brand;
    private Float maxSpeed;
    public static Float speedLimit = 250f;

    public Car() {
    }

    public Car(String brand, Float maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void printCarData() {
        System.out.printf("%n%nCarro %nmarca: %s %nvelocidade máxima: %s Km/h %nlimite de velocidade: %s Km/h",
                brand, maxSpeed, speedLimit);
    }
}
