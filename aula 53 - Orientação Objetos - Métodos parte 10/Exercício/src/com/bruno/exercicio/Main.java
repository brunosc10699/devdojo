package com.bruno.exercicio;

import com.bruno.exercicio.domain.Employee;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Bruno", 29);
        employee.getSalaries()[0] = BigDecimal.valueOf(6000);
        employee.getSalaries()[1] = BigDecimal.valueOf(10000);
        employee.getSalaries()[2] = BigDecimal.valueOf(16500);

        employee.printEmployeeData();

        employee.printAverageWage();
    }
}
