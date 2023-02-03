package com.example.myspringproject;

import com.example.myspringproject.pojo.OrdineService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    //name = corrisponde all'id del bean
    @Bean ( name = "ordineConAnn" )
    public OrdineService getOrdineService (){
        return new OrdineService();
    }
}
