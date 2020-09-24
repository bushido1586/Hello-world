package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter user ID: ");
        int id = sc.nextInt();
        try{
            if(id != 1234){
                throw new ArithmeticException("Invalid User ID");
            }
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

}
