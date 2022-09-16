package com.mycompany.lista03;

import java.util.Scanner;

public class ClassesSociais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe sua renda: ");
        Double  renda = leitor.nextDouble();
        
        MetodoClassesSociais util = new MetodoClassesSociais();
        Double media = util.calcular(renda);
        
        System.out.println(String.format("Você recebe aproximadamente %.2f salários mínimo.", media));
        
        util.identificar(media);
    }
}
