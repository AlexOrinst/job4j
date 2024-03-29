package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop fl = new FindLoop();
        int[] input = {5, 10, 3};
        int value = 5;
        int result = fl.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas7Then2() {
        FindLoop fl = new FindLoop();
        int[] input = {5, 10, 7};
        int value = 7;
        int result = fl.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas3NotFind() {
        FindLoop fl = new FindLoop();
        int[] input = {5, 10, 7};
        int value = 3;
        int result = fl.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        FindLoop fl = new FindLoop();
        int[] input = {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = fl.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFind() {
        FindLoop fl = new FindLoop();
        int[] input = {5, 2, 10, 2, 4};
        int value = 5;
        int start = 2;
        int finish = 4;
        int result = fl.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

}
