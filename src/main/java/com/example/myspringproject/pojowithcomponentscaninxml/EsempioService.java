package com.example.myspringproject.pojowithcomponentscaninxml;


import org.springframework.stereotype.Component;

@Component(value="esempio")
public class EsempioService {
    private String stringa;

    public void stampaStringa(){
        System.out.println(stringa);
    }

    public void setStringa(String stringa) {
        this.stringa = stringa;
    }


}
