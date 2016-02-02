package com.company;

public class Fibonacci {

    public static long fibonacciCalculate(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciCalculate(n - 1) + fibonacciCalculate(n - 2);
    }
}
