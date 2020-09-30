package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        String username="admin";
        String password="adminuser";
        String enteredUsername;
        String enteredPassword;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        enteredUsername = sc.next();
        if(username.equals(enteredUsername)){
            System.out.println("Enter the password");
            enteredPassword = sc.next();
            if(password.equals(enteredPassword)){
                System.out.println("Successfully logged in");
            }else{
                System.out.println("Incorrect password");
            }
        }else{
            System.out.println("Invalid username");
        }

    }

}
