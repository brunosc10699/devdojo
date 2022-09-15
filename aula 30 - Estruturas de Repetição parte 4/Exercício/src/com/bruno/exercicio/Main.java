package com.bruno.exercicio;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale brasil = new Locale("pt", "BR");

        BigDecimal vehiclePrice = new BigDecimal("30000");
        BigDecimal minimumInstallmentValue = new BigDecimal("1000");

        System.out.println("Formas de pagamento do veículo:");
        System.out.println("===============================");
        System.out.println("À vista: R$ 30.000,00");
        for (short i = 1; minimumInstallmentValue.compareTo(vehiclePrice) == -1; i++) {
            BigDecimal installmentValue = vehiclePrice.divide(BigDecimal.valueOf(i), RoundingMode.CEILING);
            if (installmentValue.compareTo(minimumInstallmentValue) == -1) break;
            System.out.println(
                    "ou " + i + " parcela(s) de " +
                    NumberFormat.getCurrencyInstance(brasil).format(installmentValue)
            );
        }
    }
}
