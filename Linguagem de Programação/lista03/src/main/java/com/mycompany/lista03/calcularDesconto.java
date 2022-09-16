package com.mycompany.lista03;

public class calcularDesconto {
    Double desconto (Double valorUn, Integer quantidade){
        if (quantidade == 1){
                return 0.10;
        }else if (quantidade == 2){
                return 0.20;
        }else{
                return 0.30;
        }
     }
}