package com.bruno.exercicio.domain;

import java.util.Objects;

public class Car {

    private String name;
    private String model;
    private Integer yearOfManufacture;

    public Car() {
    }

    public Car(String name, String model, Integer yearOfManufacture) {
        this.name = name;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(Integer yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return name.equals(car.name) && model.equals(car.model) && yearOfManufacture.equals(car.yearOfManufacture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, yearOfManufacture);
    }

    @Override
    public String toString() {
        return "\nCarro " +
                "\nnome: " + name +
                "\nmodelo: " + model +
                "\nano: " + yearOfManufacture;
    }
}
