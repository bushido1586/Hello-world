package com.company;

public class Student {
    int id;
    double phy;
    double chem;
    double math;

    Student(int id, double phy, double chem, double math){
        this.id=id;
        this.phy=phy;
        this.chem=chem;
        this.math=math;
        //this refers to the class variable instead of the parameter variable.
    }

    double percentage(double sum){
        return (sum/3);
    }

    double total(){
        return phy+chem+math;
    }

}
