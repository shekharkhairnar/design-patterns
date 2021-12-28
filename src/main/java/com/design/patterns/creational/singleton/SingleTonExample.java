package com.design.patterns.creational.singleton;

public class SingleTonExample {

    //Eager initialization
    //private static SingleTonExample instance = new SingleTonExample();
    //private static SingleTonExample instance = null;

    private SingleTonExample(){

    }
    static{
        System.out.println("SingleTonExample loaded.");
    }

    // thread safety double check
    /*public static SingleTonExample getInstance(){
        if(null == instance){
            synchronized (SingleTonExample.class){
                if(null == instance){
                    instance = new SingleTonExample();
                }
            }
        }
        return instance;
    }*/

    public static SingleTonExample getInstance(){
        System.out.println("getInstance called");
        return SingleTonExampleHelper.instance;
    }

    /*protected Object readResolve(){
        return SingleTonExampleHelper.instance;
    }*/

    private static class SingleTonExampleHelper{
        private static final SingleTonExample instance = new SingleTonExample();
        static{
            System.out.println("SingleTonExampleHelper loaded.");
        }
    }
}
