package com.example.myspringproject.pojo;

public class LibroService {
    public ProvaService prova;

    public LibroService (ProvaService prova){
        this.prova=prova;
    }

    public void stampaProvaService(){
        System.out.println("Da Libro Service, avvio il metodo stampa di ProvaService:");
        prova.stampa();
    }
}
