package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)  {

        ArrayList<String> list = new ArrayList<>();

        list.add("cat");
        list.add("jaguar");
        list.add("dog");
        //list.remove("jaguar");

        System.out.println(list.size());

        String[] s = new String[list.size()];
        s = list.toArray(s);

        for (int i =0; i<list.size(); i++){
            System.out.println(s[i]);
        }
    }

}
