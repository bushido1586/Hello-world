package com.company;



public class Main {

    public static void main(String[] args)  {

        String s1 = "John";
        String s2 = "john";

        //regular .equals() is case sesative.

        if(s1.equalsIgnoreCase(s2)){
            System.out.println("The two strings match");
        }else{
            System.out.println("The two strings to not match");
        }
    }

}
