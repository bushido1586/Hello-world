package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 4;
        switch (num){
            case 1: System.out.println("This is one");
            break;
            case 2: System.out.println("This is two");
            break;
            case 3: System.out.println("This is three");
            break;
            case 4: System.out.println("This is four");
            break;
            case 5: System.out.println("This is five");
            break;
            //much cleaner than if/else-if statements for large number of conditions.
        }
    }
}
