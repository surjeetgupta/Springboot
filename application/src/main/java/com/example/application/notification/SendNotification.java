package com.example.application.notification;

public class SendNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending notification");
    }
}
