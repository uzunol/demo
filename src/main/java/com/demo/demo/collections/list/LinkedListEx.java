package com.demo.demo.collections.list;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.addFirst("Orange");
        fruits.addLast("Mango");
        System.out.println(fruits);

        String first = fruits.getFirst();
        String last = fruits.getLast();
        String second = fruits.get(1);
        System.out.println(fruits);

        fruits.removeFirst();
        fruits.removeLast();
        fruits.remove("Apple");
        System.out.println(fruits);
    }
}
