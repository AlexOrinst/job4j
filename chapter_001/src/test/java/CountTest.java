import org.junit.Test;
import ru.job4j.loop.Count;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;



public class CountTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        assertThat(Count.addNum(1, 10), is(30));
    }
    @Test
    public void whenSumEvenNumbersFromOneToNineThenTwenty() {
        assertThat(Count.addNum(1, 9), is(20));
    }

}
