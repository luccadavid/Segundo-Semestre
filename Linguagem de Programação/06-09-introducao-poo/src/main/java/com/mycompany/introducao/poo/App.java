package com.mycompany.introducao.poo;

public class App {
    public static void main(String[] args) {
        Bolo boloMorango = new Bolo();
        Bolo boloChocolate = new Bolo();
        Bolo boloFormigueiro = new Bolo();

        boloMorango.valor = 10.00;
        boloMorango.sabor = "Morango";

        boloChocolate.valor = 10.00;
        boloChocolate.sabor = "Chocolate";
        
        boloFormigueiro.valor = 13.50;
        boloFormigueiro.sabor = "Formigueiro";
        
        boloMorango.comprarBolo(50);
        boloMorango.comprarBolo(60);
        
        boloChocolate.comprarBolo(110);
        
        boloFormigueiro.comprarBolo(90);
        boloFormigueiro.comprarBolo(5);
        
        boloMorango.exibirRelatorio();
    }
}
