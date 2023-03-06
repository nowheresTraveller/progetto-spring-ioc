package com.example.myspringproject.pojowithjavaannotation;

public class UserService {


    public void stampa(){
        System.out.println("Sono l'oggetto UserService!");
    }

    public void postInit(){
        System.out.println("Ho appena creato l'oggetto UserService!");
    }

    public void preDestroy(){
        System.out.println("Sto per distruggere l'oggetto UserService!");
    }
}
