package com.example.application.notification;

public class Order {
    SendEMail email = new SendEMail();
    SendNotification notification=new SendNotification();

    public void order(){
        System.out.println("Order placed successfully");
        email.sendNotification();
        notification.sendNotification();
    }
}
