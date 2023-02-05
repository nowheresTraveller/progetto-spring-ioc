package com.example.myspringproject.beanfactory;

import com.example.myspringproject.pojo.OrdineService;
import com.example.myspringproject.pojo.PersonaService;

public class BeanFactory {
    private static OrdineService ordine = new OrdineService();
    private static PersonaService persona = new PersonaService();

    public static OrdineService getOrdine() {
        return ordine;
    }

    public static PersonaService getPersona() {
        return persona;
    }

}
