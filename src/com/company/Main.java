package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter your score.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x= Integer.parseInt(reader.readLine());
        reader.close();
        if(x>=35){
            System.out.println("You passed!");
        }else if (x<35){
            System.out.println("You failed");
        }
    }
}
