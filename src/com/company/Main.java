package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");

        if (sc.hasNextInt()){
            int number1 = sc.nextInt(); //Scanning first number

            System.out.println("Enter + if you want to ADD;");
            System.out.println("Enter - if you want to SUBSTRACT;");
            System.out.println("Enter * if you want to MULTIPLY;");
            System.out.println("Enter / if you want to DIVIDE.");

            String action = sc.next(); //Scanning action

            System.out.println("Enter second number:");
            int number2 = sc.nextInt(); //Scanning second number


            switch  (action) {
                case "+": System.out.println(calc.mathSum(number1, number2));
                    break;
                case "-": System.out.println(calc.mathMin(number1, number2));
                    break;
                case "*": System.out.println(calc.mathMult(number1, number2));
                    break;
                case "/": System.out.println(calc.mathDiv(number1, number2));
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

