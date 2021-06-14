package nl.paulzijlmans.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMathTest {

    MyMath myMath = new MyMath();

    @Test
    public void sum_with3numbers() {
        assertEquals(6, myMath.sum(new int[]{1, 2, 3}));
    }

    @Test
    public void sum_with1number() {
        assertEquals(3, myMath.sum(new int[]{3}));
    }

}
