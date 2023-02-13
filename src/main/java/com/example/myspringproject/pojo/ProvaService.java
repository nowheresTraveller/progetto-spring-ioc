package com.example.myspringproject.pojo;

public class ProvaService {

    public AnimaleService animale;

    static{
        System.out.println ("hello world");
    }

    public void setAnimale(AnimaleService animale) {
        this.animale = animale;
    }

    public void stampa(){
        System.out.println("Hello everybody");
    }


    public void stampaVersoAnimale (){
        System.out.println("Stampo il verso dell'animale di provaService: ");
        animale.verso();
    }
}
