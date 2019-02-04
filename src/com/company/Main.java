package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");

        if (sc.hasNextInt()){
            int number1 = sc.nextInt();
            int x=number1;

            System.out.println("Enter second number:");
            int number2 = sc.nextInt();
            int y=number2;

            System.out.println("Enter + if you want to ADD;");
            System.out.println("Enter - if you want to SUBSTRACT;");
            System.out.println("Enter * if you want to MULTIPLY;");
            System.out.println("Enter / if you want to DEVIDE.");

            String action = sc.next();
            switch  (action) {
                case "+": System.out.println(calc.mathSum(x, y));
                    break;
                case "-": System.out.println(calc.mathMin(x, y));
                    break;
                case "*": System.out.println(calc.mathMult(x, y));
                    break;
                case "/": System.out.println(calc.mathDiv(x, y));
                    break;
                default: System.out.println("You have entered "+action+" Wrong action! Run program again and enter correct action: +,-,*,/.");
            }
        }
        else {
            System.out.println("Error: This is calculator. Next time please enter any number.");
        }
        sc.close();
    }
}

