package com.design.patterns.creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder().setHardDriveSize(100).setRamSize(50).build();
        System.out.println(computer);
    }
}
