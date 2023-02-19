package com.example.myspringproject.pojowithjavaannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FirstConfig {

    //name = corrisponde all'id del bean
    @Bean ( name = "user" )
    public UserService getUserService (){
        return new UserService();
    }

}
