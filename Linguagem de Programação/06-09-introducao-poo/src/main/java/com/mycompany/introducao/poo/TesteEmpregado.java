package com.mycompany.introducao.poo;

public class TesteEmpregado {

    public static void main(String[] args) {
        Empregado primeiroCargo = new Empregado();
        Empregado segundoCargo = new Empregado();

        // Cargo 1
        primeiroCargo.nome = "David";
        primeiroCargo.cargo = "Programador Full Stack";
        primeiroCargo.salario = 7000.00;
        primeiroCargo.reajuste(12);

        // Cargo 2
        segundoCargo.nome = "Rafa";
        segundoCargo.cargo = "Programador Front-End";
        segundoCargo.salario = 5000.00;
        segundoCargo.reajuste(10);
    }
}
