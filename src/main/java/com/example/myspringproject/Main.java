package com.example.myspringproject;

import com.example.myspringproject.fileconfigjavacentric.ThirdConfig;
import com.example.myspringproject.pojo.*;
import com.example.myspringproject.pojo.ProvaService;
import com.example.myspringproject.pojowithjavaannotation.*;
import com.example.myspringproject.pojowithcomponentscaninxml.FruttoService;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //containerWithXml();
        //containerWithXmlWithBeanFactory();
        //containerWithXmlWithBeanFactorySecond();
//       containerWithAnnotation();
        //getTipoBean();
        //provaLazyInit();
        //provaDipendenzaIndiretta();
        //createBeanThroughtAutowire();
        //createbeanWithScope();
        //createBeanThoughtFileProperties();
        //createBeanthoughtXmlAndAnnot();
        //CreateFromConfigXmlCentric();
        CreateFromConfigJavaCentric();
    }


    public static void CreateFromConfigXmlCentric(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-for-file-config-xmlcentric.xml");
        UserService user=context.getBean("user",UserService.class);
        user.stampa();
    }


    public static void CreateFromConfigJavaCentric(){
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.myspringproject.pojowithjavaannotation");
//        OrdineService ordine=context.getBean("ordine",OrdineService.class);
//        System.out.println(ordine.dammiListaOrdini());
        ApplicationContext context = new AnnotationConfigApplicationContext(ThirdConfig.class);
        LaptopService laptop = context.getBean("laptop",LaptopService.class);
        OrdineService ordine = context.getBean("ordine",OrdineService.class);
        System.out.println(ordine.getSaluto());

    }
    public static void createBeanthoughtXmlAndAnnot(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-with-componentScan.xml");
        /*
        EsempioService esempio = context.getBean("esempio",EsempioService.class);
        esempio.setStringa("Good morning!");
        esempio.stampaStringa();
        */

        FruttoService frutto = context.getBean ("frutto", FruttoService.class);
        frutto.setCampiMoto("harley davidson","sportster");
        frutto.stampaCampiMoto();


    }

    public static void createBeanThoughtFileProperties(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-with-fileProperties.xml");
        AutoService auto = context.getBean("auto", AutoService.class);
        System.out.println (auto.toString());
    }
    public static void createbeanWithScope(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-scope.xml");
        ProvaService prova = context.getBean("prova", ProvaService.class);
        AnimaleService animale = context.getBean("animale",AnimaleService.class);
        prova.setMiaStringa("hello");
        System.out.println("miaStringa di 'prova':");
        ProvaService secondaProva = context.getBean("prova", ProvaService.class);
        prova.stampaMiaStringa();
        System.out.println("miaStringa di 'secondaProva':");
        secondaProva.stampaMiaStringa();
        animale.verso();
    }

    public static void createBeanThroughtAutowire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-con-autowire.xml");
        ProvaService prova = context.getBean("prova", ProvaService.class);
        AnimaleService animale = context.getBean ("animale", AnimaleService.class);
        LibroService libro = context.getBean("libro",LibroService.class);
        prova.stampa();
        prova.stampaVersoAnimale();
        System.out.println("--------");
        animale.verso();
        animale.stampaProvaService();
        System.out.println("--------");
        libro.stampaProvaService();
    }

    public static void provaDipendenzaIndiretta() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        OrdineService ordine = context.getBean("ordineConDipendenza", OrdineService.class);
    }


    //Faccio una prova di 'lazy-inizialization' attraverso metodo 'init'
    public static void provaLazyInit() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-prova-lazy-init.xml");
        PersonaService persona = context.getBean("persona", PersonaService.class);
        OrdineService ordine = context.getBean("ordine", OrdineService.class);
    }

    //Creazione Ioc container che usa xml (classe = ClassPathXmlApplicationContext)
    public static void containerWithXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml", "autoBean.xml");
        /*OrdineService ordine = context.getBean("ordine", OrdineService.class);
        PersonaService firstPerson = context.getBean("persona", PersonaService.class);
        AutoService auto = context.getBean("auto", AutoService.class);
        String saluto = ordine.getSaluto();
        System.out.println(saluto);
        int ris = firstPerson.faiSomma(3, 2);
        System.out.println("Il risultato della somma è " + ris);
        System.out.println ("Lista ordini di 'firstPerson':\n"+firstPerson.miaListaOrdini());
        auto.stampaAndamento();
        System.out.println(auto.toString());
        */
        /*
        ConcessionariaService negozio = context.getBean("negozio2",ConcessionariaService.class);
        negozio.stampaNomeNegozio();
        negozio.stampaNumeroAuto();
        System.out.println (negozio.getOrdine().dammiListaOrdini());

        ConcessionariaService secondoNegozio = context.getBean("negozio3", ConcessionariaService.class);
        secondoNegozio.stampaNomeNegozio();
        secondoNegozio.stampaNumeroAuto();
        */
        AutoService auto = context.getBean("auto", AutoService.class);
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
        AutoService auto = context.getBean("auto2", AutoService.class);
        //System.out.println(ordine.getSaluto());
        //System.out.println(persona.faiSomma(3, 3));

        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) context.getAutowireCapableBeanFactory();
        registry.removeBeanDefinition("ordine2");
        registry.removeBeanDefinition("persona2");
        registry.removeBeanDefinition("auto2");

    }


    //Creazione Ioc container che usa Annotation (classe = AnnotationConfigApplicationContext)
    public static void containerWithAnnotation() {

//        ApplicationContext firstContext = new AnnotationConfigApplicationContext(FirstConfig.class);
//        UserService user = firstContext.getBean("user", UserService.class);
//        SampleService sample= firstContext.getBean("sample", SampleService.class);
//        AziendaService x =firstContext.getBean("azienda",AziendaService.class);
//        user.stampa();
//        sample.stampaDatiLaptopService();
//        x.stampaUserService();


        ApplicationContext secondContext= new AnnotationConfigApplicationContext(configWithComponentScan.class);
        LaptopService laptop= secondContext.getBean("laptop",LaptopService.class);
        AziendaService azienda = secondContext.getBean("azienda",AziendaService.class);
        System.out.println (laptop.toString());
        azienda.stampa();

    }


    //Questo metodo permette di ricavare il tipo di un bean di un Ioc container
    public static void getTipoBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Class<?> tipo = context.getType("persona");
        System.out.println(tipo.getName());
    }
}
