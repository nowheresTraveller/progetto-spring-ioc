package com.example.myspringproject.pojowithcomponentscaninxml;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//L'annotation @Resource è contenuta nella dipendenza 'javax.annotation-api'
//Le annotation @inject,@named e @managedBean sono contenute nella dipendenza 'javax.inject'


//Al posto dell'annotation '@Component' si posso utilizzare le annotation '@named' o '@ManagedBean'
@Component(value="aereo")
public class AereoService {

    private String nome;

    //"@Resource" = stessa funzionalità di @autowired.
    // si applica sui campi e sui metodi setter
    @Resource
    private EsempioService esempio;

    //Si può utilizzare l'annotation '@inject' al posto di '@autowired' o '@Resource'
    //questa si applica solo sui campi

    public AereoService() {
        nome="boing 777";
    }

    @PostConstruct
    public void metodoPostConstruct (){
        System.out.println("Hai creato l'oggetto 'AereoService'!");
    }

    @PreDestroy
    public void metodoPreDestroy(){
        System.out.println("l'oggetto 'AereoService' sta per essere distrutto!");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void stampaNome (){
        System.out.println(nome);
    }
}
