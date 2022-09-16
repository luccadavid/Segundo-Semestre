package com.mycompany.introducao.poo;

public class BilheteUnico {

    Double saldo;
    String nomeTitular;
    Boolean isEstudante;

    void usar() {
        if (isEstudante) {
            if (saldo >= 2.20) {
                saldo -= 2.20;
                System.out.println(nomeTitular + " você usou seu Bilhete. Saldo: " + saldo);
            }else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            if (saldo >= 4.40) {
                saldo -= 4.40;
                System.out.println(nomeTitular + " você usou seu Bilhete. Saldo: " + saldo);
            }else {
                System.out.println("Saldo Insuficiente");
            }
        }
    }

    void carregar(Double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Carregado - Saldo:");
        }else{
            System.out.println("Valor Inválido");
        }
    }
}
