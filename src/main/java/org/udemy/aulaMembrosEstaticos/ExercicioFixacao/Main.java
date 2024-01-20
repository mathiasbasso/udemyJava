package org.udemy.aulaMembrosEstaticos.ExercicioFixacao;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.##");

        System.out.println("Qual moeda voce deseja comprar? \n" +
                "1 - Dolar \n" +
                "2- Euro");
        int resposta = sc.nextInt();

        if (resposta==1){
            System.out.println("Quantos dólares você quer comprar? ");
            double dollarBought = sc.nextDouble();
            double dollarPrice = dollarBought * CurrencyConverter.DollarToday;
            double taxDollar = CurrencyConverter.DollarConverter(dollarPrice);
            double dollarFinal = taxDollar + dollarPrice;
            System.out.print("O valor a ser pago em reais com os impostos de 6% ja somados será: "+ formato.format(dollarFinal));
        } else if (resposta == 2){
            System.out.println("Quantos euros você quer comprar? ");
            double euroBought = sc.nextDouble();
            double euroPrice = euroBought * CurrencyConverter.EuroToday;
            double taxEuro = CurrencyConverter.EuroConverter(euroPrice);
            double euroFinal = taxEuro + euroPrice;

            System.out.print("O valor a ser pago em reais com os impostos de 4% ja somados será: "+ formato.format(euroFinal));
        }else {
            System.out.println("Viajou irmao");
        }

//        System.out.println("Qual é o valor do dólar? ");
//        double dolarPrice = sc.nextDouble();
//
//
//
//        double dolarTotal = dolarPrice * dolarBought;
//
//        double TaxTotal = CurrencyConverter.Converter(dolarTotal);
//        double realTotal = TaxTotal + dolarTotal;
//
//        System.out.print("O valor a ser pago em reais será: "+ formato.format(realTotal));


    }
}
