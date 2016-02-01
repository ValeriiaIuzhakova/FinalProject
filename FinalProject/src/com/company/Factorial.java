package com.company;

public class Factorial {
    public static long factorialCalculate(int n) {

        int result = 1;
        if (n == 0 || n == 1)
            return result;
        else {
            for (int i = 2; i <= n; i++)
               result *= i;
            return result;
        }
    }
}
