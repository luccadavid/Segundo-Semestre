package com.mycompany.lista03;

import java.util.Scanner;

public class classificaIdade {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       
        System.out.println("Escreva a sua idade: ");
        Integer idade = leitor.nextInt();
        
        MetodoClassificaIdade separador = new MetodoClassificaIdade();
        separador.etaria(idade);
    }
}
