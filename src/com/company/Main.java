package com.company;
import demo.Link;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)  {

        ArrayList<String> list = new ArrayList<String>();

        list.add("cat");
        list.add("jaguar");

        //System.out.println(list.get(1));

        list.set(1, "cheetah");

      //  System.out.println(list.get(1));

        if (list.contains("cat")){
            System.out.println("It is present");
        }else{
            System.out.println("Not present");
        }

        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }

}
