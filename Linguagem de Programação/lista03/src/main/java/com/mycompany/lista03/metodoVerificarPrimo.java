package com.mycompany.lista03;

public class metodoVerificarPrimo {
    void primo (Integer inteiro, Integer dividido){
        for (int i = 1; i <= inteiro; i++){
            if (inteiro % i == 0){
                dividido++;
            }
        }
        
        if (dividido == 2){
            System.out.println("O número é primo");
        }else {
            System.out.println("O número não é primo");
        }
    }
}
