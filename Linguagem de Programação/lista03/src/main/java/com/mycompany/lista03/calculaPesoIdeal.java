package com.mycompany.lista03;

import java.util.Scanner;

public class calculaPesoIdeal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Coloque seu sexo (M) / (F): ");
        String sexo = leitor.nextLine();
        
        System.out.println("Coloque sua altura (em metros): ");
        Double altura = leitor.nextDouble();
        
        metodoCalculaPesoIdeal util = new metodoCalculaPesoIdeal();
        Double retorno = util.pesoIdeal(sexo, altura);
        
        System.out.println(String.format("Seu peso ideal é: %.2f", retorno));
    }
}
