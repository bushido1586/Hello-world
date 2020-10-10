package com.company;

public class ThreadClass implements Runnable {
    String name;
    Thread t;
    ThreadClass(String tname){
        name = tname;
        t= new Thread(this, name);
        System.out.println(t);
    }

    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println("second thread"+i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
