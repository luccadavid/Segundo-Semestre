package com.mycompany.introducao.poo;

public class TesteBilheteUnico {
    public static void main(String[] args) {
       BilheteUnico bilhete01 = new BilheteUnico();
       BilheteUnico bilhete02 = new BilheteUnico();
       
       bilhete01.isEstudante = true;
       bilhete01.nomeTitular = "David";
       bilhete01.saldo = 1050.00;
       
       bilhete02.isEstudante = false;
       bilhete02.nomeTitular = "Rafa";
       bilhete02.saldo = 1.00;
       
        System.out.println("Usando o bilhete 01");
        bilhete01.usar();
        
        System.out.println("Usando o bilhete 02");
        bilhete02.usar();
        
        System.out.println("Carregando o bilhete 01");
        bilhete01.carregar(10.50);
        
        System.out.println("Carregando o bilhete 02");
        bilhete02.carregar(50.00);
        
        //System.out.println(bilhete01);
        //System.out.println(bilhete02);
    }
}
