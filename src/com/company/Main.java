package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        //1.)
        String s = "The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog.";
        String s1 = s.replace("fox", "frog");
        System.out.println(s1);

        //2.)
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word to replace 'Fox' with: ");
        String s2 = s.replace("fox", sc.next());
        System.out.println(s2);

        //3.)
        System.out.println("Given the text, enter word you wish to replace: ");
        String target = sc.next();
        System.out.println("Enter String to replace the target: ");
        String replace = sc.next();

        String s3 = s.replace(target, replace);
        System.out.println(s3);
    }

}
