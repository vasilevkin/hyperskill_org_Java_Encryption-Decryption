//package com.mypackage;

class Counter {

    protected int i = 1221;

    void printCount(){
        System.out.println(i);
    }

    void incCount(){
        i = i + 1;
    }

}

public class PackagePrivateDemo {

    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter.i);
    }

}