package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {

    @Test
    public void checkIfAllTrueAndLengthIsEven() {
        Check check = new Check();
        boolean[] in = {true, true, true, true};
        boolean result = check.mono(in);
        assertThat(result, is(true));
    }

    @Test
    public void checkIfAllTrueAndLengthIsOdd() {
        Check check = new Check();
        boolean[] in = {true, true, true};
        boolean result = check.mono(in);
        assertThat(result, is(true));
    }
    @Test
    public void checkIfAllFalseAndLengthIsEven() {
        Check check = new Check();
        boolean[] in = {false, false, false, false};
        boolean result = check.mono(in);
        assertThat(result, is(true));
    }
    @Test
    public void checkIfAllFalseAndLengthIsOdd() {
        Check check = new Check();
        boolean[] in = {false, false, false};
        boolean result = check.mono(in);
        assertThat(result, is(true));
    }

    @Test
    public void checkIfNotMonoAndLengthIsEven() {
        Check check = new Check();
        boolean[] in = {false, true, true, false};
        boolean result = check.mono(in);
        assertThat(result, is(false));
    }

    @Test
    public void checkIfNotMonoAndLengthIsOdd() {
        Check check = new Check();
        boolean[] in = {true, false, false};
        boolean result = check.mono(in);
        assertThat(result, is(false));
    }

}
