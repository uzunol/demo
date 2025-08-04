package com.demo.demo.collections.list;


import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private char sex;
    private int course;
    private double avgGrade;

    public Student(String name, int age, char sex, int course, double avgGrade) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.course = course;
        this.avgGrade = avgGrade;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

   @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && sex == student.sex && course == student.course && Double.compare(avgGrade, student.avgGrade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, course, avgGrade);
    }

}

class ArrayListStudents {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 18, 'm', 1, 8.3);
        Student st2 = new Student("Nikolay", 22, 'm', 3, 7.6);
        Student st3 = new Student("Anna", 23, 'f', 4, 9.4);
        Student st4 = new Student("Ekaterina", 20, 'f', 2, 8.5);
        Student st5 = new Student("Mariya", 23, 'f', 4, 6.4);
        Student st6 = new Student("Mariya", 23, 'f', 4, 6.4);

        ArrayList<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        list.add(st6);
        list.add(1,st4);
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list);
        list.stream().forEach(student -> {
            System.out.println(student);
        });

        if(st5.equals(st6)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        if (st5==st6){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }

}