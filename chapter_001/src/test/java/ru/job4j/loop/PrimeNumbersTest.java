package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PrimeNumbersTest {

    @Test
    public void when5 () {
        PrimeNumbers pn = new PrimeNumbers();
        int res = pn.calc(5);
        assertThat(res, is(3));
    }
    @Test
    public void when11 () {
        PrimeNumbers pn = new PrimeNumbers();
        int res = pn.calc(11);
        assertThat(res, is(5));
    }
    @Test
    public void when2 () {
        PrimeNumbers pn = new PrimeNumbers();
        int res = pn.calc(2);
        assertThat(res, is(1));
    }


}
