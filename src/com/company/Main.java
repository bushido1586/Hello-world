package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        String s = "This is a test, this is only a test. TESTING";
        int count =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
    }

}
