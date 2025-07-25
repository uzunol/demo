package com.demo.demo.oop.abstraction;

public class Test {
    public static void main(String[] args) {
        Employee manager = new Manager("Иван", 5000, 2000);
        Employee developer = new Developer("Анна", 4000, 50, 10);
        manager.printInfo();
        developer.printInfo();
    }
}

