package com.example.myspringproject.pojowithjavaannotation;

public class SampleService {
    private LaptopService laptop;

    public SampleService(LaptopService laptop) {
        this.laptop = laptop;
    }

    public void stampaDatiLaptopService() {
        System.out.println(laptop.toString());
    }
}
