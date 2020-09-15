package com.company;


public class Main {

    public static void main(String[] args) {

        //creating object
        double rob_marks;
        double sum;

        Student rob = new Student();
        rob.id = 1;
        rob.chem = 67;
        rob.phy = 98;
        rob.math = 84;

        sum=rob.total();
        System.out.println(sum);
        rob_marks = rob.percentage(sum);
        System.out.println(rob_marks);

    }
}
