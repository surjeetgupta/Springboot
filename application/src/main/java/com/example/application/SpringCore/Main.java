package com.example.application.SpringCore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[]) {
//        PaymentService payment=new PaymentService();
//        OrderService order=new OrderService(payment);
//        order.placeOrder();
//        System.out.println("Hello World");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
