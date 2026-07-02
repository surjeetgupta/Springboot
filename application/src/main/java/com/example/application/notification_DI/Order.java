package com.example.application.notification_DI;

public class Order {
//    SendEMail email = new SendEMail();
//    SendNotification notification=new SendNotification();
    Notification notification;

    public Order(Notification notification) {
        this.notification = notification;
    }

    public void order(){
        System.out.println("Order placed successfully");
        notification.sendNotification();
    }
}
