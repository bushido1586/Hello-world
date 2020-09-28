package com.company;



public class Main {

    public static void main(String[] args)  {

        String s1 = "Hello there";
        String s2 = "there";

        //System.out.println(s1.regionMatches(6,s2,0,4));
        System.out.println(s1.endsWith("ere"));
        System.out.println(s2.startsWith("t"));
    }

}
