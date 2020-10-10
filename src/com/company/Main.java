package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args)  {
    //List Interface

        List<String> l = new ArrayList<>();

        l.add("John");
        l.add("Mike");
        l.add("Rob");
        l.add("Steven");
        l.add(1, "Alex");

        l.remove("Rob");

        l.remove(0);

        System.out.println(l.get(2));

        ListIterator li = l.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }

    }

}
