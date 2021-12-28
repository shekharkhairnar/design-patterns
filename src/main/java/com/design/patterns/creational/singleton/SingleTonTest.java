package com.design.patterns.creational.singleton;

public class SingleTonTest {
    public static void main(String[] args) {
        for (int i=0; i<50; i++){
           new Thread(() -> System.out.println(SingleTonExample.getInstance().hashCode())).start();
        }
    }
}
