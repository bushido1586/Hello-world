package com.company;

public class Main {

    public static void main(String[] args) {

        LambdaTrials l;

        l= (a,b) -> a*b;

        System.out.println(l.displayLambda(500, 600));
    }

}
