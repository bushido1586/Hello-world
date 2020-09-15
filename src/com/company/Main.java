package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many values do you wish to enter:");
        int n = sc.nextInt();
        int[] values= new int[n];
        for(int i=0; i<n; i++){
            values[i]=sc.nextInt();
        }
        System.out.println("Your entered values are: ");
        for(int j= 0; j<n; j++){
            System.out.print(values[j]+" ");
        }
    }
}
