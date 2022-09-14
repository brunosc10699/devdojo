package com.bruno.exercicio;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

import static com.bruno.exercicio.constants.Constants.*;

public class Solucao1 {

    public static void main(String[] args) {
        var annualIncome = new BigDecimal("68507");
        incomeTaxCalculation(annualIncome);
    }

    public static void incomeTaxCalculation(BigDecimal annualIncome) {
        Locale locale = new Locale("nl-NL", "NL");
        BigDecimal tax;

        if (annualIncome.compareTo(BigDecimal.valueOf(FIRST_ANNUAL_INCOME_TRACK)) <= 0) {

            tax = annualIncome.multiply(BigDecimal.valueOf(RATE_FOR_THE_FIRST_INCOME_TRACK));

        } else if (annualIncome.compareTo(BigDecimal.valueOf(SECOND_ANNUAL_INCOME_TRACK)) <= 0) {

            tax = annualIncome.multiply(BigDecimal.valueOf(RATE_FOR_THE_SECOND_INCOME_TRACK));

        } else {

            tax = annualIncome.multiply(BigDecimal.valueOf(RATE_FOR_THE_THIRD_INCOME_TRACK));

        }

        System.out.printf(
            "O valor do imposto, devido por um indivíduo com renda anual de %s " +
            "vivendo nos Países Baixos (Holanda), é de %s",
            NumberFormat.getCurrencyInstance(locale).format(annualIncome),
            NumberFormat.getCurrencyInstance(locale).format(tax)
        );
    }
}
