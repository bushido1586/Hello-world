package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args)  {
    //TreeSet

        TreeSet<String> l = new TreeSet<>();

        l.add("Red");
        l.add("Blue");
        l.add("Green");
        l.add("Yellow");




        Iterator li = l.descendingIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }

    }

}
