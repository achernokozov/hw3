package com.company;

public class Calculator {
    public static int mathSum(int a, int b) {
        int sum = a + b;
        System.out.print("Result = ");
        return sum;
    }
    public static int mathMin(int a, int b) {
        int min = a - b;
        System.out.print("Result = ");
        return min;
    }
    public static int mathMult(int a, int b) {
        int mult = a * b;
        System.out.print("Result = ");
        return mult;
    }
    public static double mathDiv(double a, double b) {
        double div = a / b;
        System.out.print("Result = ");
        return div;
    }

}
