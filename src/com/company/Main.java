package com.company;


public class Main {

    public static void main(String[] args) {

        //creating object
        Student rob = new Student();
        rob.id=1;
        rob.chem=67;
        rob.phy=98;
        rob.math=84;

        rob.percentage();

        Student john = new Student();
        john.id=2;
        john.phy=60;
        john.chem=70;
        john.math=80;

        john.percentage();
    }
}
