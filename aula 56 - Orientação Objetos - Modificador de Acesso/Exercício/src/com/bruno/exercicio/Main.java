package com.bruno.exercicio;

import com.bruno.exercicio.domain.Employee;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setName("Bruno");
        employee1.setAge(29);
        employee1.getSalaries()[0] = BigDecimal.valueOf(6350);
        employee1.getSalaries()[1] = BigDecimal.valueOf(12650);
        employee1.getSalaries()[2] = BigDecimal.valueOf(16870);

        employee1.printEmployeeData();

        employee1.getAverageWage();

        employee1.printAverageWage();
    }
}
