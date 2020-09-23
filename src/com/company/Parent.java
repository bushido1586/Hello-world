package com.company;

public class Parent {
    void wealth(){
        System.out.println("I have $1000");
    }
    void displayName(){
        System.out.println("My name is Rob");
    }
    final void displaySurname(){
        System.out.println("Ford");
    }

}

class Child extends Parent{
    void displayName(){
        System.out.println("My name is John");
    }
}
