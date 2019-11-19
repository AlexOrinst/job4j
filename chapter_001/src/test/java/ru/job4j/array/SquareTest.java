package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square sq = new Square();
        int[] rst = sq.calculate(bound);
        int[] expect = {1, 4, 9};
        assertThat(rst, is(expect));
    }
    @Test
    public void whenBound4() {
        int bound = 4;
        Square sq = new Square();
        int[] rst = sq.calculate(bound);
        int[] expect = {1, 4, 9, 16};
        assertThat(rst, is(expect));
    }
}
