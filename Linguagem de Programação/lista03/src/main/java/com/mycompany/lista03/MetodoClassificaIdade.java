package com.mycompany.lista03;

public class MetodoClassificaIdade {
    void etaria (Integer idadePessoa){
        
        if (idadePessoa <= 2){
            System.out.println("Bebê");
        } else if (idadePessoa <= 11){
            System.out.println("Criança");
        }else if (idadePessoa <= 19){
            System.out.println("Adolescente");
        }else if (idadePessoa <= 30){
            System.out.println("Jovem");
        }else if (idadePessoa <= 60){
            System.out.println("Adulto");
        }else {
            System.out.println("Idoso");
        }
    }
}
