package com.mycompany.lista03;

import java.util.Scanner;

public class DescontoProgressivo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Sistema de Desconto Progressivo");
        
        System.out.println("Digite o valor da unidade do produto: ");
        Double valorUn = leitor.nextDouble();
        
        System.out.println("Digite a quantidade: ");
        Integer quantidade = leitor.nextInt();
        
        calcularDesconto util = new calcularDesconto();
        Double valorFinal = util.desconto(valorUn, quantidade);
        
        System.out.println(String.format("Valor do produto: %.2f", valorUn));
        System.out.println(String.format("Quantidade: %d", quantidade));
        System.out.println("------------------------------------------------------");
        System.out.println(String.format("Valor com desconto: %.2f", valorFinal));
    }
}
