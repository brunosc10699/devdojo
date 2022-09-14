package com.bruno.exercicio;

import java.text.NumberFormat;
import java.util.Locale;

public class Solucao2 {

    public static void main(String[] args) {

        Locale locale = new Locale("nl-NL", "NL");

        var firstAnnualIncomeTrack = 34712f;
        var secondAnnualIncomeTrack = 68507;
        var rateForTheFirstIncomeTrack = 0.097f;
        var rateForTheSecondIncomeTrack = 0.3735f;
        var rateForTheThirdIncomeTrack = 0.495f;

        var annualIncome = 68507f;

        float tax;

        if (annualIncome <= firstAnnualIncomeTrack) {
            tax = annualIncome * rateForTheFirstIncomeTrack;
        } else if (annualIncome <= secondAnnualIncomeTrack) {
            tax = annualIncome * rateForTheSecondIncomeTrack;
        } else {
            tax = annualIncome * rateForTheThirdIncomeTrack;
        }

        System.out.printf(
                "O valor do imposto, devido por um indivíduo com renda anual de %s " +
                "vivendo nos Países Baixos (Holanda), é de %s",
                NumberFormat.getCurrencyInstance(locale).format(annualIncome),
                NumberFormat.getCurrencyInstance(locale).format(tax));
    }
}
