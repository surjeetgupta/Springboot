package com.example.application.Bean_Scopes;

import com.example.application.SpringCore.Payment.CardPayment;
import com.example.application.SpringCore.Payment.UpiPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration // tells spring framework that this class is a configuration class,and it will be used to configure the beans(objects) in the application context.
@ComponentScan("com.example.application.Bean_Scopes") //if package not provided than it will scan in the same folder where the config class resides.
public class ApplicationConfig {
    //empty
    @Bean
    @Primary
    public OrderService order1(){
        System.out.println("Creating OrderService bean with name order1");
        return new OrderService();
    }

    @Bean
    public OrderService order2(){
        System.out.println("Creating OrderService bean with name order2");
        return new OrderService();
    }
}

