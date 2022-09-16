package com.mycompany.lista03;

public class MetodoClassesSociais {
    Double calcular(Double renda1){
        return renda1 / 1100;
    }        
    void identificar (Double renda1){
        if(renda1 <= 2){
            System.out.println("Você pertence a classe E");
        }else if(renda1 <= 4){
            System.out.println("Você pertence a classe D");
        }else if(renda1 <= 10){
            System.out.println("Você pertence a classe C");
        }else if(renda1 <= 20){
            System.out.println("Você pertence a classe B");
        }else{
            System.out.println("Você pertence a classe A");
        }
    }
}