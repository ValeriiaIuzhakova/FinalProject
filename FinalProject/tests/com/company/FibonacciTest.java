package com.company;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FibonacciTest {
    private Fibonacci fibonacci;
    private IllegalArgumentException e;

    @BeforeClass
    public void setUpClass() throws Exception {
        fibonacci = new Fibonacci();
        e = new IllegalArgumentException();
    }

    @Test
    public void testForSimpleElement() throws Exception {

        long result = Fibonacci.fibonacciCalculate(10);

        Assert.assertEquals(55,result);

    }

    @Test
    public void testForFirstElement() throws Exception {

        long result = Fibonacci.fibonacciCalculate(1);

        Assert.assertEquals(1,result);

    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testForVerifyException() throws IllegalArgumentException{

        //processing...
    }




}
