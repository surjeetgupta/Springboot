package com.example.application.notification_DI;

public class SendEMail implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending email notification");
    }
}
