package com.example.application.ExampleControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public  String hello() {
        return "<h1>Hello, World!</h1>";
    }
}

