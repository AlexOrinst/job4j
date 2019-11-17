package ru.job4j.loop;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;




public class FitnessTest {

    @Test
    public void calcTest1() {
        Fitness fit = new Fitness();
        int month = fit.calc(95, 90);
        Assert.assertThat(month, is(0));
    }

    @Test
    public void calcTest2() {
        Fitness fit = new Fitness();
        int month = fit.calc(90, 95);
        Assert.assertThat(month, is(1));
    }

    @Test
    public void calcTest3() {
        Fitness fit = new Fitness();
        int month = fit.calc(50, 90);
        Assert.assertThat(month, is(2));
    }


}
