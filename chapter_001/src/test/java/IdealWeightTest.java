package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class IdealWeightTest {

    @Test
    public void manWeight () {
        int in = 175;
        double expected = 86.25;
        double out = IdealWeight.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight () {
        int in = 163;
        double expected = 60.95;
        double out = IdealWeight.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

}
