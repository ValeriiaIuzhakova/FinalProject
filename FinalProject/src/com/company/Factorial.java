

public class Factorial {

    public static long factorialCalculate(int num) {
        int fact=1;

        for (; num > 0; fact *= num--);

        return fact;
    }
}