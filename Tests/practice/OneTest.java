package practice;

import org.junit.Assert;
import org.junit.Test;
import practice.One;

public class OneTest {

    @Test
    public void strCount() {
        Assert.assertEquals(2,new One().strCount("catcowcat","cat"));
    }
}