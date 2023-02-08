package com.example.myspringproject.pojo;

public class AutoService {

    private String marca, modello;



    public void stampaAndamento (){
        System.out.println("l'auto sta andando a 300 km/h");
    }

    public void initAuto (){
        System.out.println("sono nel metodo 'init()' di AutoService");
    }


    public void cleanAuto (){
        System.out.println("sono nel metodo 'clean()' di AutoService");
    }

    public String toString (){
        return "Quest'auto è una "+marca+" modello "+modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }
}
