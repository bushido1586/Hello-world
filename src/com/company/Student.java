package com.company;

public class Student {
    int id;
    double phy;
    double chem;
    double math;

    double percentage(double sum){
        return (sum/3);
    }

    double total(){
        return phy+chem+math;
    }

}
