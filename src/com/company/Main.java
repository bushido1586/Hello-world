package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter some text");
        String s = sc.nextLine();
        int count =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
    }

}
