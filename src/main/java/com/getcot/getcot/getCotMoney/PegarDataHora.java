package com.getcot.getcot.getCotMoney;


import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PegarDataHora {

    //Teste com Scheduled para pegar a cada 30 segundos a data e hora atual.
    @Scheduled(fixedRate = 30000)
    public void verificarDataHora(){

        Date pegaData = new Date();
        //Pegando a data e hora atual a cada 30 segundos
        System.out.println("Data e hora atual: "+ pegaData);
    }

}
