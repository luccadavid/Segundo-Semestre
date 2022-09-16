package com.mycompany.lista03;

import java.util.Scanner;

public class calcularMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva sua primeira nota: ");
        Double  nota1 = leitor.nextDouble();
        
        System.out.println("Escreva sua segunda nota: ");
        Double  nota2 = leitor.nextDouble();
        
        // Puxando Media de CalculadoraMedia
        CalculadoraMedia util = new CalculadoraMedia();
        Double media = util.Calcular(nota1, nota2);
        
        System.out.println(String.format("Sua nota %.2f", media));
    }
}
