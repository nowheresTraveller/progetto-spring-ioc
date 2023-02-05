package com.example.myspringproject;

import com.example.myspringproject.pojo.AutoService;
import com.example.myspringproject.pojo.OrdineService;
import com.example.myspringproject.pojo.PersonaService;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //containerWithXml();
        containerWithXmlWithBeanFactory();
        //containerWithXmlWithBeanFactorySecond();
        //containerWithAnnotation();
    }


    //Creazione Ioc container che usa xml (classe = ClassPathXmlApplicationContext)
    public static void containerWithXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml", "autoBean.xml");
        OrdineService ordine = context.getBean("ordine", OrdineService.class);
        PersonaService persona = context.getBean("persona", PersonaService.class);
        AutoService auto = context.getBean("auto", AutoService.class);
        String saluto = ordine.getSaluto();
        System.out.println(saluto);
        int ris = persona.faiSomma(3, 2);
        System.out.println("Il risultato della somma è " + ris);
        auto.stampaAndamento();
    }


    //Creazione Ioc container che usa xml con beans factory
    public static void containerWithXmlWithBeanFactory() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-factory.xml");
        OrdineService ordine = context.getBean("ordineService", OrdineService.class);
        PersonaService persona = context.getBean("personaService", PersonaService.class);
        System.out.println(ordine.getSaluto());
        System.out.println(persona.faiSomma(3, 3));
        //Procedura per la distruzione dei bean con id 'ordine'
        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) context.getAutowireCapableBeanFactory();
        registry.removeBeanDefinition("ordineService");
    }

    //Creazione Ioc container che usa xml con beans factory con metodi d'istanza
    public static void containerWithXmlWithBeanFactorySecond() {
        ApplicationContext context = new ClassPathXmlApplicationContext("second-beans-factory.xml");
        OrdineService ordine = context.getBean("ordine2", OrdineService.class);
        PersonaService persona = context.getBean("persona2", PersonaService.class);
        System.out.println(ordine.getSaluto());
        System.out.println(persona.faiSomma(3, 3));
    }



    //Creazione Ioc container che usa Annotation (classe = AnnotationConfigApplicationContext)

    public static void containerWithAnnotation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        OrdineService ordine = context.getBean("ordineConAnn", OrdineService.class);
        System.out.println(ordine.getSaluto());
    }
}
