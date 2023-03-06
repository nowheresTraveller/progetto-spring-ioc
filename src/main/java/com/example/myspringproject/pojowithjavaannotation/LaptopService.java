package com.example.myspringproject.pojowithjavaannotation;

import org.springframework.stereotype.Component;

@Component(value="laptop")
public class LaptopService {
    private String marca;
    private String modello;

    public LaptopService() {
    }

    public LaptopService(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    @Override
    public String toString (){
        return marca+" "+modello;
    }
}
