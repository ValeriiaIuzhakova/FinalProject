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
                VerifyCorrectUserData(num);
                System.out.println(Fibonacci.fibonacciCalculate(num));
                break;
            }
            case 2: {
                System.out.println("Enter the number: ");
                int num = sc.nextInt();
                VerifyCorrectUserData(num);
                System.out.println(Factorial.factorialCalculate(num));
                break;
            }
            default: {
               try {
                   throw new IllegalArgumentException();
               }
               catch (IllegalArgumentException e){
                   System.out.println("You entered an invalid number. You can select only 1 or 2");
                   System.exit(0);
               }
            }

        }
    }
    public static void VerifyCorrectUserData(int num) {
        try{
            if(num <= 0){
                throw new IllegalArgumentException();
            }

        } catch (IllegalArgumentException e){
            System.out.println("[ERROR]: Your number = " + num + "." + "\n" + "Number should be > 0");
            System.exit(0);
        }

    }
}