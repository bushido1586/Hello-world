package com.company;

public class Car implements Comparable<Car>{
    int price;
    String name;
    String brand;

    Car(int p, String n, String b){
        price = p;
        name = n;
        brand = b;
    }

    @Override
    public int compareTo(Car c) {
        if(price>c.price){
            return 1;
        } else if (price<c.price){
            return -1;
        }else {
            return 0;
        }
    }
}
