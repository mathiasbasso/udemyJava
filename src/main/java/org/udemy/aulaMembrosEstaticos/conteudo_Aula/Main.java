package org.udemy.aulaMembrosEstaticos.conteudo_Aula;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //para retornar os doubles com 2 casas decimais
        DecimalFormat formato = new DecimalFormat("#.##");

        System.out.print("Enter radius: ");
        double radious = sc.nextDouble();

        double c = Calculator.circumference(radious);
        double v = Calculator.volume(radious);

        System.out.printf("Circumferece: %s%n", formato.format(c));
        System.out.printf("Volume:  %s%n", formato.format(v));
        System.out.printf("PI Value: %s%n", formato.format(Calculator.PI));

        sc.close();
    }
    //versao 1
    //nao posso chamar um metodo que nao é estático, dentro de um que é estático
    // exemplo: se eu tirar o static dos metodos circumference ou volume, o programa
    // nao vai rodar. nesse caso o main é estatico, e exige outros estaticos.

    //versao 2 - criação do calculator. metodos nao sao mais estaticos
    //Com isso, instaciei um objeto  Calculator calc = new Calculator(); e em
    // seguida chamei as operações de acordo com o
    // objeto, no caso calc.circumferece, calc.volume e calc.PI

    //versao 3 e final
    // os metodos voltam a ser estaticos e chamo a classe Calculator para o funcionamento
    //posso utilizar os membros independe do objeto.
    //Calculator foi a classe utilitaria com operacoes e constantes estaticas,
    // eu uso as operaçoes e
    //constantes apenas com o nome da classe

}
