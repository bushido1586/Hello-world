package com.company;

public class Student {
    int id;
    double phy;
    double chem;
    double math;

    double percentage(){
        return ((phy+chem+math)/3);
    }

}
