package com.example.myspringproject.pojo;

import java.beans.ConstructorProperties;

public class ConcessionariaService {
    private AutoService auto;
    private OrdineService ordine;
    private String nome;

    private int numeroAuto;

    public ConcessionariaService(AutoService auto, OrdineService ordine, String nome) {
        this.auto = auto;
        this.ordine = ordine;
        this.nome = nome;
    }

    public ConcessionariaService(String nome, int numeroAuto, OrdineService ordine) {
        this.nome = nome;
        this.numeroAuto = numeroAuto;
        this.ordine= ordine;
    }

    @ConstructorProperties({"nomeConcessionaria","numeroDiAuto"})
    public ConcessionariaService(String val1, int val2) {
        this.nome = val1;
        this.numeroAuto = val2;
    }

    public void stampaAutoInNegozio (){
        System.out.println ("Questa è l'auto presento nel nostro negozio:\n- "+auto.toString());
    }

    public void stampaNomeNegozio(){
        System.out.println("- Nome concessionario = "+nome);
    }

    public void stampaNumeroAuto(){
        System.out.println("- Numero auto del concessionario = "+numeroAuto);
    }

    public AutoService getAuto() {
        return auto;
    }

    public OrdineService getOrdine() {
        return ordine;
    }
}
