package com.afs.oopractice;

public class HelloWorld {

    public static void main(String[] args){
        Car car = new Car("Car", 30);
        car.printSpeedUp();
        Truck truck = new Truck("Truck", 10);
        truck.printSpeedUp();
    }
}
