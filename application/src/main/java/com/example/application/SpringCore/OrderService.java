package com.example.application.SpringCore;

import com.example.application.SpringCore.Payment.PaymentService;
import com.example.application.SpringCore.Payment.UpiPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // this tells the spring to manage the objects of this class.
public class OrderService {
    //@Autowired
    private PaymentService paymentService;

    @Autowired
    public OrderService(@Qualifier("cp") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order placed successfully");
    }
}
