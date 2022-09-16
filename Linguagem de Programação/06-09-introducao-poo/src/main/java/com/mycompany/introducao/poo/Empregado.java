package com.mycompany.introducao.poo;

public class Empregado {

    String nome;
    String cargo;
    Double salario;

    void reajuste (Integer porcentagem) {
        Double porcentagemReajuste = porcentagem / 100.0;

        salario += (salario * porcentagemReajuste);
        System.out.println(String.format("O salário de %s, que ocupa o cargo %s, depois do reajuste será de %.2f", nome, cargo, salario));
    }
}
