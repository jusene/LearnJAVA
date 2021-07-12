package com.jusene.day1_base;

public class Employee {
    static int a = 1;
    static int b = 3;

    public int Sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
         int sum = new Employee().Sum(a, b);
         System.out.println(sum);
    }
}
