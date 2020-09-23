package com.company;

import java.util.Scanner;

public class Employee {
    int emplId;
    String name;
    int age;


    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID");
        this.emplId=sc.nextInt();
        System.out.println("Enter employee name: ");
        this.name = sc.next();
        System.out.println("enter employee age:");
        this.age = sc.nextInt();
    }

    public void getData(){
        System.out.println(this.emplId+" "+ this.name+" "+this.age);
    }
}


