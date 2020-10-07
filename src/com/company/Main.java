package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args)  {

        Car c1 = new Car(20000, "3 Series", "BMW");
        Car c2 = new Car(30000, "Cherokee", "Jeep");
        Car c3 = new Car(40000, "f150", "Ford");

        ArrayList<Car> c = new ArrayList<>();
        c.add(c1);
        c.add(c2);
        c.add(c3);

        for (Car car : c) {
            System.out.println(car.brand + " " + car.name + " " + car.price);
        }

    }

}
