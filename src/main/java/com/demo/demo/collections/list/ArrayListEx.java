package com.demo.demo.collections.list;

import java.util.ArrayList;


public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);
    ArrayList<Integer> list2 = new ArrayList<>(list1);
        System.out.println(list2);
        ArrayList<String>list3=new ArrayList<>();

    }


}
