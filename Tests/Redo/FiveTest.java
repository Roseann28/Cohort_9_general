package Redo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FiveTest {

    @Test
    public void isPalindrome() {
        Assert.assertTrue("Yes",Five.isPalindrome("ana"));
    }
}