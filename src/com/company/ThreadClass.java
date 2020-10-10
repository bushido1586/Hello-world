package com.company;

public class ThreadClass implements Runnable {
    String name;
    Thread t;
    ThreadClass(String tname){
        name = tname;
        t= new Thread(this, name);
        System.out.println(t);
    }

    @Override
    public void run() {
        System.out.println("thread is Running");
    }
}
