package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Practice Example 19:

        ArrayList<String> food = new ArrayList<>();
        food.add("Chicken Parm");
        food.add("Apple Pie");
        food.add("Hibachi");
        food.add("Pizza");
        food.add("Cheeseburger");

        for (String s : food) {
            System.out.println(s);
        }
        System.out.println("^forEach loop, for loop|");

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }

}
