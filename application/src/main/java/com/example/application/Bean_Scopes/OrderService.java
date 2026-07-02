package com.example.application.Bean_Scopes;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton") //default scope is singleton, so this annotation is optional here.
//@Scope("prototype") //if we want to create a new instance of the bean every time we request it, we can use prototype scope.
//@Lazy //if we want to create the bean only when it is requested for the first time, we can use lazy initialization.
public class OrderService {

    public OrderService() {
        System.out.println("OrderService instance created.");
    }

    public void placeOrder() {
        System.out.println("Order placed successfully!");
    }
}
