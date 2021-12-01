package com.afs.oopractice;

public class HelloWorld {

    public static void main(String[] args){
        Car car = new Car("Car", 30);
        car.printSpeedUp();

        Truck truck = new Truck("Truck", 10);
        truck.printSpeedUp();

        Driver carDriver = new Driver(new Car("Car", 30));
        Driver truckDriver = new Driver(new Truck("Truck", 10));
        carDriver.printSpeedUp();
        truckDriver.printSpeedUp();

        GasolineEngine gasolineEngine = new GasolineEngine();
        ElectricEngine electricEngine = new ElectricEngine();
        Car gasolineCar = new Car("Gasoline Car", gasolineEngine);
        gasolineCar.printSpeedUp();
        Car electricCar = new Car("Electric Car", electricEngine);
        electricCar.printSpeedUp();
    }
}
