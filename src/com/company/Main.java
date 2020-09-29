package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter username: ");
        String userName = sc.next();
        System.out.println("Please enter password: ");
        String password = sc.next();

        if (userName.length()>6 && password.length()>8){
            System.out.println("Thank you, "+userName+", welcome!");
        }else if(userName.length()<6 && password.length()>8){
            System.out.println("Username not accepted, please make username more than 6 characters");
        }else if(userName.length()>6 && password.length()<8){
            System.out.println("Password must be 8 characters");
        }else if (userName.length()<6 && password.length()<8){
            System.out.println("Username and password do not meet minimum requirements");
        }

    }

}
