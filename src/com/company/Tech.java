package com.company;

import java.util.Scanner;

public class Tech {
    int hoursWorked;
    int hourlyRate;

    public void getSalary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hourly Rate: ");
        this.hourlyRate=sc.nextInt();
        System.out.println("Enter Hours Worked: ");
        this.hoursWorked= sc.nextInt();
        System.out.println("Salary: "+hoursWorked*hourlyRate);

    }
}
