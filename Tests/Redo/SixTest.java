package Redo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SixTest {

    @Test
    public void isAnagram() {
        Assert.assertTrue("anagrams",Six.isAnagram("act","cat"));
    }
}