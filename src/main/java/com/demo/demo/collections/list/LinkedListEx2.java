package com.demo.demo.collections.list;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListEx2 {
    public static void main(String[] args) {
        Deque<Integer> numbers = new LinkedList<>();
        numbers.addFirst(10);
        numbers.addLast(20);
        numbers.offer(5);
        numbers.offerLast(25);
        System.out.println(numbers);

        int first = numbers.pollFirst();
        int last = numbers.pollLast();
        int peekFirst = numbers.peekFirst();
        int peekLast = numbers.peekLast();

        System.out.println(numbers);
    }
}
