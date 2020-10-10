package com.company;

public class Main {

    public static void main(String[] args) {

        Demo<String> demo = new Demo<>("Hello");
        System.out.println(demo.getValue());
    }

}
