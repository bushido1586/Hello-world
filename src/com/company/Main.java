package com.company;

public class Main {

    public static void main(String[] args) {

        Thread t = new Thread();
        t.setName("DemoThread");
        System.out.println(t.currentThread());
        //[main,5,main]-thread name, priority, group.


    }

}
