package com.company;

public class People implements Eat, Play {

    @Override
    public void eating() {
        System.out.println("Person is eating");
    }

    @Override
    public void playing() {
        System.out.println("Person is playing");

    }
}
