package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args)  {
    //HashSet

        Set<String> l = new HashSet<>();

        l.add("John");
        l.add("Mike");
        l.add("Rob");
        l.add("Steven");
        l.add("Alex");

        l.remove("Rob");


        Iterator li = l.iterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }

    }

}
