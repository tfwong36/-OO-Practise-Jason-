package com.afs.oopractice;

public class Vehicle {
    private final String name;
    private final int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void printSpeedUp(){
        System.out.printf("%s : speed up %d km/h\n", name, speed);
    }
}
