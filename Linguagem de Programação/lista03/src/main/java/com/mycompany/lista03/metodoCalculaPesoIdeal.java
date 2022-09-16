package com.mycompany.lista03;

public class metodoCalculaPesoIdeal {
    Double pesoIdeal (String sexo, Double altura){
        if (sexo.equalsIgnoreCase("M")){
            return 72.7 * altura - 58;
        }else {
            return 62.1 * altura - 44.7;
        }
    }
}