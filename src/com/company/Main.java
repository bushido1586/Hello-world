package com.company;



public class Main {

    public static void main(String[] args)  {

        String s1 = "Hello there";
        String s2 = "there";


        //^ toffset where to start first ont, oofset where to start, second one, len starts at index 0

        System.out.println(s1.regionMatches(6,s2,0,4));
    }

}
