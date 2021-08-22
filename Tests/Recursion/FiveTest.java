package Recursion;

import org.junit.Assert;
import org.junit.Test;

public class FiveTest {

    @Test
    public void parenBit() {
        Assert.assertEquals("(abc)", new Five().parenBit("xyz(abc)123"));
    }
}