package com.example.application.Bean_Scopes;

import com.example.application.Bean_Scopes.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();
//        OrderService order2= context.getBean(OrderService.class);
//        order2.placeOrder();
//        OrderService order3= new OrderService();
//        //now order 3 will,be new object created because we are creating it using new keyword and not from spring context.
//        order3.placeOrder();
//        System.out.println(order==order2); //true because by default spring beans are singleton

        OrderService order1 = context.getBean(OrderService.class);
        OrderService order2 = context.getBean(OrderService.class);
        System.out.println(order1 == order2); //false because we have used prototype scope for OrderService bean.
    }
}
