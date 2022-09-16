package com.mycompany.lista03;

import java.util.Scanner;

public class verificarPrimo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        metodoVerificarPrimo util = new metodoVerificarPrimo();
        
        Integer inteiro = 0;
        
        while (inteiro >= 0){
        System.out.println("Digite um número inteiro: ");
        inteiro = leitor.nextInt();
        util.primo(inteiro, 0);
        }
    }
}
