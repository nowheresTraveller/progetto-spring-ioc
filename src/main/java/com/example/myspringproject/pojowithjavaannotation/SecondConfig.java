package com.example.myspringproject.pojowithjavaannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//Attraverso '@ComponentScan' posso trattare come bean le classi di un determinato package aventi l'annotation '@Component'
@Configuration
@ComponentScan(basePackages = "com.example.myspringproject.pojowithjavaannotation")
public class SecondConfig {


}
