package com.example.myspringproject.pojo;

public class OrdineService {

    public String getSaluto (){
        return "hello";
    }


    //Metodo che viene eseguito nella fase di post-inizialization
    public void init (){
        System.out.println (" ---- Hai creato un oggetto ordine");
    }


    //Metodo che viene eseguito nella fase di pre-destroy di un bean
    public void clean(){
        System.out.println (" ------ Sono in clean");

    }
}
