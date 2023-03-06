package com.example.myspringproject.pojowithjavaannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Scope;

@Configuration
public class FirstConfig {

    //I tipi di dependency injection che si possono utilizzare nei file di configurazione java annotation sono
    //il setter injection (attraverso l'autowiring) e il constructor injection
    // (passando direttamente al costruttore di un bean un parametro)


    //name = corrisponde all'id del bean
    //initMethod e destroyMethod abilitano rispettivamente i metodi di post-init e pre-destroy della classe
    @Bean(name = "user", initMethod = "postInit",destroyMethod = "preDestroy")
    public UserService getUserService() {
        return new UserService();
    }



    //@Scope = indica lo scope del bean
    @Bean(name = "azienda")
    @Scope("prototype")
    public AziendaService getAziendaService() {
        return new AziendaService();
    }


    //Dependency injection di tipo constructor
    //@Description = dà una descrizione del bean
    @Bean (name = "sample")
    @Description("Questo è un oggetto SampleService")
    public SampleService getSampleService(){
        return new SampleService(new LaptopService("HP","pavillion 600"));
    }

}
