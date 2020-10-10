package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

        ThreadClass tc1 = new ThreadClass("2");
        tc1.t.start();
        tc1.t.join();

        for (int i=0; i<5; i++){
            System.out.println("Main thread"+i);
            Thread.sleep(1000);
        }
    }

}
