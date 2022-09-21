package com.bruno.exercicio.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Arrays;

public class Employee {

    private String name;
    private Integer age;

    private final BigDecimal[] salaries = new BigDecimal[3];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void getAverageWage() {
        BigDecimal averageWage = Arrays.stream(salaries)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(BigDecimal.valueOf(salaries.length), RoundingMode.CEILING);
        System.out.println("A média salarial é "+ NumberFormat.getCurrencyInstance().format(averageWage));
    }

    public BigDecimal[] getSalaries() {
        return salaries;
    }

    public void printAverageWage() {
        if (salaries[0] == null || salaries[1] == null || salaries[2] == null) return;
        getAverageWage();
    }

    public void printEmployeeData() {
        System.out.println("Funcionário" +
                "\nnome: " + name +
                "\nidade: " + age +
                "\nsalários: " + Arrays.toString(salaries));
    }
}
