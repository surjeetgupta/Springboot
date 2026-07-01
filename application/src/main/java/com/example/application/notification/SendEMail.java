package com.example.application.notification;

public class SendEMail implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending email notification");
    }
}
