package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndWithTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean res = EndsWith.endsWith(word, post);
        assertThat(res, is(true));
    }

    @Test
    public void whenStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'p', 'o'};
        boolean res = EndsWith.endsWith(word, post);
        assertThat(res, is(false));
    }

    @Test
    public void whenStartWithPrefixThenFalse2() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'k', 'l', 'o'};
        boolean res = EndsWith.endsWith(word, post);
        assertThat(res, is(false));
    }

}
