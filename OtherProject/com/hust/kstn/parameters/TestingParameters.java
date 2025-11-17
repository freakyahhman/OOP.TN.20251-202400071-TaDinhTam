package com.hust.kstn.parameters;

public class TestingParameters {
    public static void main(String[] args) {
        Students s1 = new Students(1, "A");
        Students s2 = new Students(2, "B");
        swap(s1, s2);
        System.out.println("First student: " + s1.name);
        System.out.println("Second student: " + s2.name);
    }
    public static void swap(Students a, Students b) {
        Students temp = a;
        a = b;
        b = temp;
    }
}