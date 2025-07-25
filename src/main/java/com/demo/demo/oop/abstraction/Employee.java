package com.demo.demo.oop.abstraction;

abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalare) {
        this.name = name;
        this.baseSalary = baseSalare;
    }

    public abstract double calculateSalary();

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Зарплата: " + calculateSalary());
    }
}


