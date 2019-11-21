package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {

    @Test
    public void whenFirstMin(){
        assertThat(MinDiapason.findMin(new int[] {-1, 0, 4, 8}, 1, 3), is(0));
    }

    @Test
    public void whenSecondMin(){
        assertThat(MinDiapason.findMin(new int[] {-1, 4, 0, 8}, 1, 3), is(0));
    }
    @Test
    public void whenFirstMin2(){
        assertThat(MinDiapason.findMin(new int[] {0, -1, 4, 0, 8, 2}, 1, 4), is(-1));
    }


}
