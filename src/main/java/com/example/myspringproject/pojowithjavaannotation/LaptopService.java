package com.example.myspringproject.pojowithjavaannotation;

public class LaptopService {
    private String marca;
    private String modello;

    public LaptopService(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    @Override
    public String toString (){
        return marca+" "+modello;
    }
}
