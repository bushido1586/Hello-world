package com.company;
import demo.Link;

public class Main {

    public static void main(String[] args)  {
        Customer c = new Customer();
        c.deposit();
        c.withdraw();
        c.updateBalance();


    }

    public static class Bank{
        void deposit(){
            System.out.println("Amount has been deposited");
        }
        void withdraw(){
            System.out.println("Amount has been withdrawn");
        }
        void updateBalance(){
            System.out.println("Balance has been updated");
        }
    }
    public static class Customer extends Bank{}
}
