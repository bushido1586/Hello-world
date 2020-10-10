package com.company;

public class ThreadClass implements Runnable {
    Thread t;

    ThreadClass(){
        t= new Thread(this, "New Thread");
        System.out.println("Thread "+t);
    }
    @Override
    public void run() {
        System.out.println("This is a new thread");
    }
}
