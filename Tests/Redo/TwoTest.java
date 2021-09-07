package Redo;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TwoTest {

    @Test
    public void phone() {
        Map<String,Integer> contacts=new HashMap<>();
        contacts.put("rose",720212488);
        Assert.assertEquals(720212488,Two.phone(contacts,"rose"));
    }
}