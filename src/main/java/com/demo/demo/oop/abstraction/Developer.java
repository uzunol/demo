package com.demo.demo.oop.abstraction;

public class Developer extends Employee {
    private int overtimeHours;
    private double overtimeRate;

    public Developer(String name, double baseSalary, double overtimeRate, int overtimeHours) {
        super(name, baseSalary);
        this.overtimeRate = overtimeRate;
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (overtimeHours * overtimeRate);
    }
}

