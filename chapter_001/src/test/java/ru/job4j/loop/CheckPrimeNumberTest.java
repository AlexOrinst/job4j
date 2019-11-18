package ru.job4j.loop;
import junit.framework.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;



public class CheckPrimeNumberTest {

    @Test
    public void when5 () {
        ChechPrimeNumber check = new ChechPrimeNumber();
        boolean res = check.isPrime(5);
        assertThat(res, is(true));
    }

    @Test
    public void when4 () {
        ChechPrimeNumber check = new ChechPrimeNumber();
        boolean res = check.isPrime(4);
        assertThat(res, is(false));
    }


}
