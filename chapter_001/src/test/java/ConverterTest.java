package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro () {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar () {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void euroToRubles () {
        int in = 50;
        int expected = 3500;
        int out = Converter.euroToRubles(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void dollarToRubles () {
        int in = 50;
        int expected = 3000;
        int out = Converter.dollarToRubles(in);
        Assert.assertEquals(expected, out);
    }


}
