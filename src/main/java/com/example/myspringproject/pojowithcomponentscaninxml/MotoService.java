package com.example.myspringproject.pojowithcomponentscaninxml;


import org.springframework.stereotype.Component;

@Component(value="moto")
public class MotoService {

    private String marca;
    private String modello;

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
