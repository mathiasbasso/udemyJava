package org.udemy.Secao_9.Sobrecarga;

import java.text.DecimalFormat;

public class Product {
    DecimalFormat formato = new DecimalFormat("#.##");

    public String name;
    public double price;
    public int quantity;

    //criando construtor para o name e price e quantity serem obrigatorios ja na instanciacao
    // o cara que executa no momento da instaciacao do objeto
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // criando o construtor opcional. sem quantity, que será iniciado com 0, ja que
    // é uma variavel primitiva, int.
    public Product(String name, double price){
        this.name = name;
        this.price = price;

    }

    public double totalValueInStock(){
        return price*quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return "Product data: "+name
                +", $"+ price+", "+
                formato.format(quantity)+" units. Total: "+ "$ "+
                formato.format(totalValueInStock());
    }
}
