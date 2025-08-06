package com.demo.demo.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String>name=new ArrayList<>();
        name.add("Inna");
        name.add("Andrei");
        name.add("Ivan");
        name.add("Anna");

        Iterator<String>iterator=name.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
