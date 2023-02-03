package com.example.myspringproject;

import com.example.myspringproject.pojo.AutoService;
import com.example.myspringproject.pojo.OrdineService;
import com.example.myspringproject.pojo.PersonaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //Creazione Ioc container in xml (classe = ClassPathXmlApplicationContext)
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml","autoBean.xml");
        OrdineService ordine = context.getBean("ordine", OrdineService.class);
        PersonaService persona = context.getBean ("persona", PersonaService.class);
        AutoService auto = context.getBean("auto",AutoService.class);
        String saluto = ordine.getSaluto();
        System.out.println(saluto);
        int ris = persona.faiSomma(3,2);
        System.out.println("Il risultato della somma è "+ris);
        auto.stampaAndamento();


        //Creazione Ioc container con annotation (classe = AnnotationConfigApplicationContext)
        /*
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        OrdineService ordine = context.getBean("ordineConAnn", OrdineService.class);
        System.out.println (ordine.getSaluto());
        */

    }
}
