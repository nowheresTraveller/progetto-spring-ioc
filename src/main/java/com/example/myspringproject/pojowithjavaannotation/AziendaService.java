package com.example.myspringproject.pojowithjavaannotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "azienda")
public class AziendaService {
    @Autowired
    private UserService user;



    public void stampa(){
        System.out.println("Sono l'oggetto AziendaService");
    }

    public void setUser(UserService user) {
        this.user = user;
    }

    public void stampaUserService(){
        user.stampa();
    }
}
