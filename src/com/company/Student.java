package com.company;

import java.util.Scanner;

public class Student {
    int phy;
    int chem;

    void acceptMarks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter phy marks:");
        phy = sc.nextInt();
        System.out.println("enter chem marks:");
        chem = sc.nextInt();
    }
    void displayMarks(){
        System.out.println("Physics"+phy);
        System.out.println("Chemistry"+chem);
    }

}

class BioStudent extends Student{
    int bio;

    void acceptBioMarks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter bio marks:");
        bio = sc.nextInt();
    }
    void displayBioMarks(){
        System.out.println("Biology"+bio);
    }
}
class EnggStudent extends Student{
    int math;

    void acceptMathMarks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter math marks:");
        math = sc.nextInt();
    }
    void displayMathMarks(){
        System.out.println("Maths "+math);
    }
}