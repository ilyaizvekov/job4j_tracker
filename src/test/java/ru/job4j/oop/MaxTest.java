package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2And3Then10() {
        Max one = new Max();
        double result = one.max(10, 2, 3);
        double expected = 10;
        Assert.assertEquals(result, expected, 0);
    }

    @Test
    public void whenMax4To1And2And3Then22() {
        Max one = new Max();
        double result = one.max(10, 2, 3, 22);
        double expected = 22;
        Assert.assertEquals(result, expected, 0);
    }
}