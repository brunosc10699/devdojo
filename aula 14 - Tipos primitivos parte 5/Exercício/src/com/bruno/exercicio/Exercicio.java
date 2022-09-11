package com.bruno.exercicio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercicio {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Locale locale = new Locale("pt", "BR");

        String name = "Bruno";
        String address = "Avenida dos Oliveiras, 1000";
        BigDecimal salary = new BigDecimal("30007.055");
        LocalDate date = LocalDate.now();

        String report = "Eu " +
                name +
                ", morando no endereço " +
                address +
                ", confirmo que recebi o salário de " +
                NumberFormat.getCurrencyInstance(locale).format(salary) +
                ", na data " +
                date.format(dateTimeFormatter) +
                ".";

        System.out.println(report);
    }
}
