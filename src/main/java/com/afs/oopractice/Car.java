package com.afs.oopractice;

public class Car extends Vehicle {

    public Car(String name, Engine engine) {
        super (name, engine.speed());
    }
    public Car(String name, int speed) {
        super (name, speed);
    }
}