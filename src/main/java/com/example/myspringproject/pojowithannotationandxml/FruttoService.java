package com.example.myspringproject.pojowithannotationandxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="frutto")
public class FruttoService {

    private EsempioService esempio;
    @Autowired
    private MotoService moto;

    @Autowired

    public FruttoService(EsempioService esempio) {
        this.esempio = esempio;
    }

    public FruttoService (){}

    @Autowired
    public void mioMetodo(AereoService aereo){
        aereo.stampaNome();
    }

    public void setCampiMoto(String marca,String modello){
        moto.setMarca(marca);
        moto.setModello(modello);
    }

    public void stampaCampiMoto (){
        System.out.println("marca :"+moto.getMarca()+"\nmodello : "+moto.getModello());
    }

}
