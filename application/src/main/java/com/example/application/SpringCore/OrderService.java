package com.example.application.SpringCore;

import org.springframework.stereotype.Component;

@Component // this tells the spring to manage the objects of this class.
public class OrderService {

    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }



    public void placeOrder(){
        if(paymentService.pay()){
            System.out.println("Order placed successfully");
        }else {
            System.out.println("Payment failed. Order not placed.");
        }
    }
}
