package com.company;

public class Demo<T> {
    T value;

    public Demo(T v){
        value =v;
    }

    T getValue(){
        return value;
    }
}
