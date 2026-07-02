package com.example.application;

import com.example.application.notification_DI.Notification;
import com.example.application.notification_DI.Order;
import com.example.application.notification_DI.SendEMail;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Notification notification = new SendEMail() ;//make an object of interface and can be used to crate an object of any class that implements the interface;
		Order order = new Order(notification);
		order.order();
	}

}
