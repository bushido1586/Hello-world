package com.company;

public class ThreadClass extends Thread {

    ThreadClass(){
        super("New Thread");
        System.out.println(this);
    }

    public void run(){
        System.out.println("Thread is Running");
    }

}
