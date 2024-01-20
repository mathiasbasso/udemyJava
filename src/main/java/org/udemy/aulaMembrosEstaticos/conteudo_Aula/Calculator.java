package org.udemy.aulaMembrosEstaticos.conteudo_Aula;

public class Calculator {
    //classe utilitaria com operacoes e constantes estaticas, eu uso as operaçoes e
    //constantes apenas com o nome da classe

    public static final double PI = 3.14159; //Com a palavra final, PI se torna algo
    //constante, nao podendo ser alterada.

    public static double circumference(double radious){
        return 2.0 * PI * radious;
    }
    public static double volume(double radious){
        return 4.0 * PI * radious * radious * radious / 3.0;
    }

}
