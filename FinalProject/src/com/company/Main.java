package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate Fibonacci - enter 1, Factorial - 2: ");
        int operation = sc.nextInt();

        switch (operation) {
            case 1: {
                System.out.println("Enter the number: ");
                int num = sc.nextInt();
                System.out.println(Fibonacci.fibonacciCalculate(num));
                break;
            }
            case 2: {
                //Factorial
                break;
            }
        }
    }
}