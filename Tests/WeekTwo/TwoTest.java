package WeekTwo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TwoTest {

    @Test
    public void sort() {
        int[]a={3141,1,3,10,3,5};
        int[]b={1,3,3,5,10,3141};
        Assert.assertEquals(Arrays.toString(b), Arrays.toString(new Two().solve(a)));
    }
}