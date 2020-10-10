package com.company;

public class Main {

    public static void main(String[] args) {
        ThreadClass t = new ThreadClass();
        t.start();

        for (int i = 0; i < 5; i++) {
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + " is running");
        }

    }
}
