package com.company;



public class Main {

    public static void main(String[] args)  {
        String sentence ="This is some text";
        /*void getChars(int sourceStart, int sourceEnd, char target, int targetStart)
        enter value from where you want to start, end, target, and where it goes
         */
        int start =0;
        int end = 10;
        char tar[] = new char[end-start];

        sentence.getChars(start, end, tar, 0);
        System.out.println(tar);




    }

}
