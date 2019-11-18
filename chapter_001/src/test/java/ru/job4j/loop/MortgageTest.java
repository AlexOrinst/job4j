package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


public class MortgageTest {

    @Test
    public void when1Year() {
        Mortgage m = new Mortgage();
        int year = m.year(1000, 1200, 1);
        assertThat(year, is(1));
    }

    @Test
    public void when2Year() {
        Mortgage m = new Mortgage();
        int year = m.year(100, 120, 50);
        assertThat(year, is(2));
    }

    @Test
    public void when10Year() {
        Mortgage m = new Mortgage();
        int year = m.year(200, 50, 30);
        assertThat(year, is(10));
    }



}
