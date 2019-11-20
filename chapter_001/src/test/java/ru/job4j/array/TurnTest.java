package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void tryToTurnWhenEvenElems() {
        Turn t = new Turn();
        int[] in = {1, 2, 3, 4};
        int[] exp = {4, 3, 2, 1};
        int[] out = t.back(in);
        assertThat(out, is(exp));
    }
    @Test
    public void tryToTurnWhenEvenElems2() {
        Turn t = new Turn();
        int[] in = {4, 1, 6, 2};
        int[] exp = {2, 6, 1, 4};
        int[] out = t.back(in);
        assertThat(out, is(exp));
    }

    @Test
    public void tryToTurnWhenOddElems() {
        Turn t = new Turn();
        int[] in = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] exp = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] out = t.back(in);
        assertThat(out, is(exp));
    }


}
