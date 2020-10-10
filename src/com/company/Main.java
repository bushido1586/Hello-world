package com.company;

public class Main {

    public static void main(String[] args) {

        Demo<Integer, String> demo = new Demo<>(100, "Hello");
        System.out.println(demo.getValue());
        System.out.println(demo.getMessage());
    }

}
