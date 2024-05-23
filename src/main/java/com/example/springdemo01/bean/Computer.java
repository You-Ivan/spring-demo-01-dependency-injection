package com.example.springdemo01.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    // 1. field injection
//    @Autowired
    private CPU cpu;
    private Screen screen;



    // 2. constructor injection
//    public Computer(CPU cpu) {
//        this.cpu = cpu;
//    }


    // 3. setter injection
    @Autowired
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    @Autowired
    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void print() {
        System.out.println("Computer is printing!");
    }
}
