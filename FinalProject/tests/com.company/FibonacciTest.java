package com.company;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeClass
    public void setUpClass() throws Exception {
        fibonacci = new Fibonacci();
        System.out.println("setup method");
    }

    @Test
    public void testForSimpleElement() throws Exception {

        long result = Fibonacci.fibonacciCalculate(10);

        Assert.assertEquals(34,result);

    }

    @Test
    public void testForFirstElement() throws Exception {

        long result = Fibonacci.fibonacciCalculate(1);

        Assert.assertEquals(0,result);

    }


}
