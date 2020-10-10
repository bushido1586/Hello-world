package com.company;

public class Main {

    public static void main(String[] args) {

        ThreadClass tc1 = new ThreadClass("1");
        ThreadClass tc2 = new ThreadClass("2");
        ThreadClass tc3 = new ThreadClass("3");

        tc1.t.start();
        tc2.t.start();
        tc3.t.start();
    }

}
