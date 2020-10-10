package com.company;

public class Main {

    public static void main(String[] args) {

        Person p;

        p=(age)-> {
            if(age>18){
                System.out.println("Adult");
            }else{
                System.out.println("Not an adult");
            }
        };

        p.checkForAdult(29);
    }

}
