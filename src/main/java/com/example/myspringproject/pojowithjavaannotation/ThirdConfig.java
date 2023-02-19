package com.example.myspringproject.pojowithjavaannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

// Creazione Container java-centric:
// Attraverso file di configurazione java che utilizza un file xml
// per prelevare dei dati (o altro)
@Configuration
@ImportResource("second-bean-with-fileProperties.xml")
public class ThirdConfig {

    @Value("${thirdConfig.marcaLaptop}")
    private String marca;
    @Value("${thirdConfig.modelloLaptop}")
    private String modello;

    @Bean(name = "laptop")
    public LaptopService getLaptop(){
        return new LaptopService(marca,modello);
    }


}
