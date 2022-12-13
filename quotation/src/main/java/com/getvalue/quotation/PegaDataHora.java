package com.getvalue.quotation;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.DateUtils;

import java.util.*;

@Component
public class PegaDataHora {

    //A cada 30 segundos verifica a data atual.
    @Scheduled(fixedRate = 30000)
    public void verificaDataHora(){
        
        Date pegaData = new java.util.Date();

        System.out.println("A data atual coletada é: "+pegaData);

    }
}
