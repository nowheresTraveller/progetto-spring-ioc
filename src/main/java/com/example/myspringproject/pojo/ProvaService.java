package com.example.myspringproject.pojo;

public class ProvaService {

    public AnimaleService animale;
    public String miaStringa;

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

    public void setMiaStringa(String miaStringa) {
        this.miaStringa = miaStringa;
    }

    public void stampaMiaStringa(){
        System.out.println(miaStringa);
    }
}
