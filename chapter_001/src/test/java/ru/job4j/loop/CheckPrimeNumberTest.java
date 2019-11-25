package ru.job4j.loop;

import junit.framework.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        CheckPrimeNumber check = new CheckPrimeNumber();
        boolean res = check.isPrime(5);
        assertThat(res, is(true));
    }

    @Test
    public void when3() {
        CheckPrimeNumber check = new CheckPrimeNumber();
        boolean res = check.isPrime(3);
        assertThat(res, is(true));
    }

    @Test
    public void when2() {
        CheckPrimeNumber check = new CheckPrimeNumber();
        boolean res = check.isPrime(2);
        assertThat(res, is(true));
    }

    @Test
    public void when4() {
        CheckPrimeNumber check = new CheckPrimeNumber();
        boolean res = check.isPrime(4);
        assertThat(res, is(false));
    }

    @Test
    public void when6() {
        CheckPrimeNumber check = new CheckPrimeNumber();
        boolean res = check.isPrime(6);
        assertThat(res, is(false));
    }


}
