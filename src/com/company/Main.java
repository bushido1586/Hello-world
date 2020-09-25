package com.company;


import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        FileInputStream f = new FileInputStream("demo.txt");
        int i = f.read();
        while(i != -1){
            System.out.print((char)i);
            i = f.read();
        }
        f.close();
    }

}
