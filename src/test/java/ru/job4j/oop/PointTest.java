package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distancePoint = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, distancePoint, 0.01);
    }

    @Test
    public void when112to63then5dot09() {
        Point a = new Point(11, 2);
        Point b = new Point(6, 3);
        double distancePoint = a.distance(b);
        double expected = 5.09;
        Assert.assertEquals(expected, distancePoint, 0.01);
    }

    @Test
    public void when43to71then3dot60() {
        Point a = new Point(4, 3);
        Point b = new Point(7, 1);
        double distancePoint = a.distance(b);
        double expected = 3.60;
        Assert.assertEquals(expected, distancePoint, 0.01);
    }

    @Test
    public void when435to716then5dot38() {
        Point a = new Point(4, 3, 5);
        Point b = new Point(7, 1, 9);
        double distancePoint = a.distance3d(b);
        double expected = 5.38;
        Assert.assertEquals(expected, distancePoint, 0.01);
    }
}