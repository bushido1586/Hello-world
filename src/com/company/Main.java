package com.company;


public class Main {

    public static void main(String[] args) {

        //creating object
        double rob_marks;
        double john_marks;

        Student rob = new Student();
        rob.id=1;
        rob.chem=67;
        rob.phy=98;
        rob.math=84;

        rob_marks = rob.percentage();
        System.out.println(rob_marks);

        Student john = new Student();
        john.id=2;
        john.phy=60;
        john.chem=70;
        john.math=80;

        john_marks = john.percentage();
        System.out.println(john_marks);
    }
}
