package com.example.application.SpringCore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[]) {
//        PaymentService payment=new PaymentService();
//        OrderService order=new OrderService(payment);
//        order.placeOrder();
//        System.out.println("Hello World");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); //t will up the ioc container and scan the package for the beans and create the objects of the classes which are annotated with @Component and manage them in the ioc container.

        OrderService order=context.getBean(OrderService.class); // it will get the object of the class from the ioc container.
        order.placeOrder();

//        PaymentService payment=context.getBean(PaymentService.class); // it will get the object of the class from the ioc container.
//        payment.pay();
    }
}
