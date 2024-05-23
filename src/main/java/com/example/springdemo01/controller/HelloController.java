package com.example.springdemo01.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello SpringBoot!";
    }
}
