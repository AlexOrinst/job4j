import org.junit.Test;
import org.hamcrest.core.*;
import org.junit.Assert;
import ru.job4j.SqMax;


public class SqMaxTest {

    @Test
    public void max () {
        int n1 = 2;
        int n2 = 3;
        int n3 = 5;
        int n4 = 1;
        int exp = 5;
        int res = SqMax.max(n1, n2, n3, n4);
        Assert.assertEquals(exp, res);
    }

    @Test
    public void max2 () {
        int n1 = 66;
        int n2 = 787;
        int n3 = 656;
        int n4 = 11212;
        int exp = 11212;
        int res = SqMax.max(n1, n2, n3, n4);
        Assert.assertEquals(exp, res);
    }

    @Test
    public void max3 () {
        int n1 = 10;
        int n2 = 2;
        int n3 = 30;
        int n4 = 4;
        int exp = 30;
        int res = SqMax.max(n1, n2, n3, n4);
        Assert.assertEquals(exp, res);
    }



}
