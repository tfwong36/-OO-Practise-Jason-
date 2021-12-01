package com.afs.oopractice;

public class Truck {
    private String name;
    private int speed;

    public Truck(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void printSpeedUp(){
        System.out.printf("%s : speed up %d km/h\n", name, speed);
    }
}
