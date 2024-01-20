package org.udemy.aulaMembrosEstaticos.ExercicioFixacao;

public class CurrencyConverter {

    public static final double DollarToday = 4.52;

    public static final double EuroToday = 6.20;
     static double DollarConverter(double dollarPrice){
         return dollarPrice * 6/100;
     }
    static double EuroConverter(double euroPrice){
        return euroPrice * 4/100;
    }


}
