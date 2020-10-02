package com.company;

public class Vehicle implements Car {

    @Override
    public void drive() {
        System.out.println("Car Has started");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
    }
}
