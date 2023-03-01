package com.example.myspringproject.fileconfigxmlcentric;

import com.example.myspringproject.pojowithjavaannotation.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {


    @Bean( name = "user" )
    public UserService getUserService (){
        return new UserService();
    }
}
