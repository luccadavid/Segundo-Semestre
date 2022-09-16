package com.mycompany.introducao.poo;

public class TesteEncomenda {

    public static void main(String[] args) {
        Encomenda pacote = new Encomenda();

        pacote.tamanho = 'G';
        pacote.enderecoRemetente = "Avenida Paulista, 2000";
        pacote.enderecoDestinatario = "Rua dos Cravos, 50";
        pacote.valorEncomenda = 199.99;
        pacote.distancia = 50.7;
        pacote.calculoDoFrete();
        pacote.etiqueta();
    }
}
