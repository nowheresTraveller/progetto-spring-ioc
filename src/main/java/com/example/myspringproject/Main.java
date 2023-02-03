package com.example.myspringproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        OrdineService ordine = context.getBean("ordine", OrdineService.class);
        String saluto = ordine.getSaluto();
        System.out.println(saluto);
    }
}
