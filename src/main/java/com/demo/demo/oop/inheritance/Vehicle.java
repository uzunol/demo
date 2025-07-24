package com.demo.demo.oop.inheritance;

public class Vehicle {
    protected String model;
    protected int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Двигатель запущен");
    }
}

class Car extends Vehicle {
    private int doorCount;

    public Car(String model, int year, int doorCount) {
        super(model, year);
        this.doorCount = doorCount;
    }

    public void honk() {
        System.out.println("БИ_БИП");
    }
}

class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String model, int year, int doorCount, int batteryCapacity) {
        super(model, year, doorCount);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Электродвигатель активирован");
    }


    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic", 2020);
        Car car = new Car("Tayota", 2022, 4);
        ElectricCar tesla = new ElectricCar("Model S", 2023, 4, 100);
        vehicle.startEngine();
        car.honk();
        tesla.startEngine();
    }

}
