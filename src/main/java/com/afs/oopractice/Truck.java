package com.afs.oopractice;

public class Truck extends Vehicle {
    public Truck(String name, Engine engine) {
        super (name, engine.speed());
    }
    public Truck(String name, int speed) {
        super (name, speed);
    }
}
