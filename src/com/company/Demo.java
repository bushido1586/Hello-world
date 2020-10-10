package com.company;

public class Demo<T, Y> {
    T value;
    Y message;

    public Demo(T v, Y m){
        value =v;
        message = m;
    }

    T getValue(){
        return value;
    }

    Y getMessage(){
        return message;
    }
}
