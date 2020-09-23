package com.company;

public class CircleArea {
    int radius;
    CircleArea(int radius){
        this.radius=radius;
    }
    double area(){
        return Math.PI*radius*radius;
    }

    double perimeter(){
        return 2* Math.PI * radius;
    }
}
