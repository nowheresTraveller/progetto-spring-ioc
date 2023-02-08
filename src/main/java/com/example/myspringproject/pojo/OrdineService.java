package com.example.myspringproject.pojo;

public class OrdineService {

    public String getSaluto (){
        return "hello";
    }


    //Metodo che viene eseguito nella fase di post-inizialization
    public void init (){
        System.out.println (" ---- Sono nel metodo 'init()' di 'OrdineService'");
    }


    //Metodo che viene eseguito nella fase di pre-destroy di un bean
    public void clean(){
        System.out.println (" ------ Sono nel metodo 'clean()' di 'OrdineService'");
    }

    public String dammiListaOrdini (){
        return "-Ordine1\n-Ordine2\n-Ordine3\n";
    }
}
