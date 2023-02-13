package com.example.myspringproject.pojo;

public class AnimaleService {
    public ProvaService prova;


    public void setProva(ProvaService prova) {
        this.prova = prova;
    }

    public void verso(){
        System.out.println("verso animale : bau");
    }

    public void stampaProvaService(){
        System.out.println("avvio metodo stampa di provaService da animaleService:");
        prova.stampa();
    }
}
