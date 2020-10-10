package com.company;

public class Main {

    public static void main(String[] args) {

        Message<String> message;
        message = (m)->{
          return m;
        };
        System.out.println(message.displayMessage("Hello There"));

        Message<Integer> message1;
        message1 = (m) ->{
            return m;
        };
        System.out.println(message1.displayMessage(100));
    }

}
