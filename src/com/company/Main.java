package com.company;


import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        FileOutputStream f = new FileOutputStream("demo.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text for the file:");
        String s = reader.readLine();
        byte b[] =s.getBytes();
        f.write(b);
        f.close();
    }

}
