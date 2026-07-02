package com.example.application.SpringCore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // tells spring framework that this class is a configuration class,and it will be used to configure the beans(objects) in the application context.
@ComponentScan("com.example.application.SpringCore")
public class AppConfig {

}
