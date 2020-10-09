package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args)  {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("John");
        ll.add("Alex");
        ll.add("Rob");
        ll.add("Phillip");

        ll.add(1, "Johny");

        LinkedList<String> l1 = new LinkedList<>();
        l1.add("Ford");
        l1.add("Mercury");
        l1.add("BMW");

        ll.addAll(l1);

        ll.addFirst("FirstName");
        ll.addLast("CarName");

        ll.remove("Alex");

        ll.remove(0);

        //ll.clear();

        Iterator<String> i = ll.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }

}
