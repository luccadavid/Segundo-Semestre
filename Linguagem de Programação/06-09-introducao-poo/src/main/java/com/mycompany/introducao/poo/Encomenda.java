package com.mycompany.introducao.poo;

public class Encomenda {
    
    char tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double valorEncomenda;
    Double frete = 0.0;
    Double distancia;

    void calculoDoFrete () {
        switch (tamanho) {
            case 'P':
                frete = valorEncomenda * 0.01;
                break;
            case 'M':
                frete = valorEncomenda * 0.03;
                break;
            case 'G':
                frete = valorEncomenda * 0.05;
                break;
            default:
                System.out.println("Insira um tamanho válido, valores aceitos são tamanho P, M ou G");
                break;
        }
        if (distancia > 0){
            if (distancia <= 50){
                frete += 3.0;
            } else if (distancia > 50 && distancia <= 200) {
                frete += 5.0;
            } else if (distancia > 200) {
                frete += 7.0;
            }
        } 
        else {
            System.out.println("Coloque algo válido para a distância");
        }
}
    
    void etiqueta () {
        if (tamanho != 'P' && tamanho != 'M' && tamanho != 'G') {
            System.out.println("Coloque um tamanho existente, tamanhos aceitos são P, M ou G");
        } 
        else {
            String tamanhoRoupa = "";
            switch (tamanho) {
        case 'P':
                    tamanhoRoupa = "Pequeno";
                    break;
         case 'M':
                    tamanhoRoupa = "Médio";
                    break;
         case 'G':
                    tamanhoRoupa = "Grande";
                    break;
            }
            System.out.println("----- ETIQUETA PARA ENVIO -----");
            System.out.println(String.format("Endereço do remetente: %s", enderecoRemetente));
            System.out.println(String.format("Endereço do destinatário: %s", enderecoDestinatario));
            System.out.println(String.format("Tamanho: %s", tamanhoRoupa));
            System.out.println(String.format("Valor encomenda: R$%.2f", valorEncomenda));
            System.out.println(String.format("Valor frete: R$%.2f", frete));
            System.out.println(String.format("Valor total R$%.2f", (frete + valorEncomenda)));
        }
    }
}