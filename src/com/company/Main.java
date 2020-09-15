package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a number:");
        int num = Integer.parseInt(reader.readLine());
        reader.close();
        for(int i=0; i<11; i++){
            System.out.println(i*num);
        }
    }
}
