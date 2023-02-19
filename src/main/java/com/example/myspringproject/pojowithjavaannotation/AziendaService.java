package com.example.myspringproject.pojowithjavaannotation;


import org.springframework.stereotype.Component;

@Component(value = "azienda")
public class AziendaService {

    public void stampa(){
        System.out.println("Sono l'oggetto AziendaService");
    }
}
