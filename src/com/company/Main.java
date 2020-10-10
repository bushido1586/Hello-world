package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Brad", 1, 85.6);
        Student s2 = new Student("Kristin", 2, 95.4);
        Student s3 = new Student("Paul", 3, 90.5);
        Student s4 = new Student("Holly", 4, 92.1);

        ArrayList<Student> roster = new ArrayList<>();
        roster.add(s1);
        roster.add(s2);
        roster.add(s3);
        roster.add(s4);

        for (Student student : roster) {
            System.out.println(student.id + " " + student.name + " " + student.percentage);
        }


    }

}
