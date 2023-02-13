package com.example.myspringproject.pojowithannotation;


import org.springframework.stereotype.Component;

@Component(value="aereo")
public class AereoService {

    private String nome;

    public AereoService() {
        nome="boing 777";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void stampaNome (){
        System.out.println(nome);
    }
}
