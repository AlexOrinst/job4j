package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void findMinWhenFirst() {
        assertThat(Min.findMin(new int[]{0, 5, 10}), is(0));
    }

    @Test
    public void findMinWhenLast() {
        assertThat(Min.findMin(new int[]{10, 5, 1}), is(1));
    }

    @Test
    public void findMinWhenMid() {
        assertThat(Min.findMin(new int[]{10, -1, 1}), is(-1));
    }
}
