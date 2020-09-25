package com.company;


import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("balance.txt"));
        int currentBalance = sc.nextInt();
        System.out.println(currentBalance);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter deposit amount: ");
        int deposit = sc1.nextInt();

        currentBalance+=deposit;

        System.out.println("Updated balance is: "+currentBalance);
        FileOutputStream outstream = new FileOutputStream("balance.txt");
        int bal = currentBalance;
        String s = Integer.toString(bal);
        byte b[]=s.getBytes();
        outstream.write(b);
        outstream.close();
    }

}
