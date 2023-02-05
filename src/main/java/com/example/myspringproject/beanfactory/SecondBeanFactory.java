package com.example.myspringproject.beanfactory;

import com.example.myspringproject.pojo.OrdineService;
import com.example.myspringproject.pojo.PersonaService;

//bean factory con metodi d'istanza
public class SecondBeanFactory {
    private OrdineService ordine = new OrdineService();

    private PersonaService persona = new PersonaService();

    public OrdineService getOrdine() {
        return ordine;
    }

    public PersonaService getPersona() {
        return persona;
    }
}
