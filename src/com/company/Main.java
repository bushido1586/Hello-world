package com.company;
import demo.Link;

public class Main {

    public static void main(String[] args)  {
        PrivateBank pb = new PrivateBank("John");
        pb.interestPaid();

        GovernmentBank gb = new GovernmentBank("Rob");
        gb.interestPaid();
    }

}
