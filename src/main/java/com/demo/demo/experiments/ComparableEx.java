package com.demo.demo.experiments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12354);
        Employee emp2 = new Employee(112, "Anna", "Krilova", 45000);
        Employee emp3 = new Employee(134, "Alex", "Kuru", 9000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting \n " +list);
//        Collections.sort();

    }
}


