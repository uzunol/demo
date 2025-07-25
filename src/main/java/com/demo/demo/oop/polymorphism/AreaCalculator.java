package com.demo.demo.oop.polymorphism;

public class AreaCalculator {
    public void printArea(Shape shape) {
        System.out.println("площадь: " + shape.calculateArea());
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        AreaCalculator calculator = new AreaCalculator();
        calculator.printArea(circle);
        calculator.printArea(rectangle);
    }
}
