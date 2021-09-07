package practice;

import org.junit.Assert;
import org.junit.Test;
import practice.Two;

public class TwoTest {

    @Test
    public void pairStar() {
        Assert.assertEquals("hel*lo",new Two().pairStar("hello"));
    }
}