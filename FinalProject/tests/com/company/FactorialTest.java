package com.company;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FactorialTest {
    private Factorial factorial;

    @BeforeClass
    public void setUpClass() throws Exception {
        factorial = new Factorial();
    }

    @Test
    public void testForSimpleElement() throws Exception {

        long result = Factorial.factorialCalculate(7);

        Assert.assertEquals(5040, result);

    }

    @Test
    public void testForFirstElement() throws Exception {

        long result = Factorial.factorialCalculate(1);

        Assert.assertEquals(1,result);

    }
}
