package com.company;

public class AnExample {
    int a= 10;
    void displayData(){
        System.out.println("This is a method");
    }

}

class B extends AnExample{
    int b = 20;
}

class C extends B{
    int c = 30;
}
