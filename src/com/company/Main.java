package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


Person p2=new Student("max",17,"here",60,192547);

        System.out.println(p2.toString());




    }
}
class Person{
    public Person(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    String name;
    int age;
    String adress;

}
class Student extends Person{
    int marks;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", marks=" + marks +
                ", rollNumber=" + rollNumber +
                '}';
    }

    public Student(String name, int age, String adress, int marks, int rollNumber) {
        super(name, age, adress);
        this.marks = marks;
        this.rollNumber = rollNumber;
    }

    int rollNumber;
}
class GraduateStudent extends Student{
    public GraduateStudent(String name, int age, String adress, int marks, int rollNumber, String graduationDate) {
        super(name, age, adress, marks, rollNumber);
        this.graduationDate = graduationDate;
    }

    String graduationDate;
}