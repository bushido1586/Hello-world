package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter deposit amount: ");
        int deposit = sc.nextInt();
        int accountBalance = 0;
        try{
            if(deposit < 0){
                throw new NegativeNotAllowedException("Negative Not allowed");
            }
        }catch (ArithmeticException | NegativeNotAllowedException e){
            System.out.println("Negative not allowed");
        }
        System.out.println("Account balance now: "+ (accountBalance+deposit));

    }

}
