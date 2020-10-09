package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args)  {
//putting objects into LinkedList
        LinkedList<Car> c = new LinkedList<>();
        Car c1 = new Car(50000, "Cherokee", "Jeep");
        Car c2 = new Car(30000, "Corolla", "Toyota");
        Car c3 = new Car(40000, "Charger", "Dodge");
        Car c4 = new Car(60000, "F150 Raptor", "Ford");

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        for (Car car : c){
            System.out.println(car.brand+" "+ car.name+" "+car.price);
        }
    }

}
