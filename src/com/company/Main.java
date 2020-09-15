package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        int[] ticket_price ={100,150,500,20};
        int[] discounted_price = new int[ticket_price.length];
        int new_price;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int discount = Integer.parseInt(reader.readLine());
        reader.close();

        for(int i=0; i< ticket_price.length; i++){
            new_price = (ticket_price[i] - (ticket_price[i]* discount)/100);
            discounted_price[i] = new_price;
        }
        for (int i : discounted_price) {
            System.out.println(i);
        }

    }
}
