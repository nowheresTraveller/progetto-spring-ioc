package com.example.myspringproject.pojo;

public class PersonaService {

    private OrdineService mioOrdine;

    public void init (){
        System.out.println (" ---- Sono nel metodo 'init()' di 'PersonaService'");
    }

    public void clean(){
        System.out.println (" ------ Sono nel metodo 'clean()' di 'PersonaService'");
    }

    public int faiSomma(int x, int y){
        return x+y;
    }

    public String miaListaOrdini(){
        return mioOrdine.dammiListaOrdini();
    }

    public OrdineService getMioOrdine() {
        return mioOrdine;
    }

    public void setMioOrdine(OrdineService mioOrdine) {
        this.mioOrdine = mioOrdine;
    }
}
