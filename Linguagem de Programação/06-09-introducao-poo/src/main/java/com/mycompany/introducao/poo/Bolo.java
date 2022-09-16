package com.mycompany.introducao.poo;

public class Bolo {
    Double valor;
    String sabor;
    Integer quantidadeVendida = 0;
    
    void comprarBolo(Integer quantidadeBolo) {
        if ((quantidadeVendida + quantidadeBolo) > 100){
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        }else {
            quantidadeVendida += quantidadeBolo;
        }
    }
    
    void exibirRelatorio(){
        if (quantidadeVendida > 0){
            Double valorTotal = valor * quantidadeVendida;
            System.out.println("O bolo sabor " + sabor + ", foi comprado " + quantidadeVendida + " vezes hoje, totalizando R$" + valorTotal);
        }else {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        }
    }
}
