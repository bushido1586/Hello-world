package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args)  {
    //TreeSet part 2 (objects)

        TreeSet<Car> t = new TreeSet<>();
        Car c1 = new Car(50000, "Cherokee", "Jeep");
        Car c2 = new Car(65000, "525i", "BMW");
        Car c3 = new Car(80000, "A8", "audi");
        Car c4 = new Car(40000, "Camry", "Toyota");

        t.add(c1);
        t.add(c2);
        t.add(c3);
        t.add(c4);

        for (Car cars : t){
            System.out.println(cars.brand+" "+cars.name+" "+cars.price);
        }

    }

}
