package com.company;

public class Main {

    public static void main(String[] args) {

        ThreadClass tc1 = new ThreadClass("2");
        tc1.t.start();
        for (int i=0; i<5; i++){
            System.out.println("Main thread"+i);
        }
    }

}
