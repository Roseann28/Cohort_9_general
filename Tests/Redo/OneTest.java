package Redo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class OneTest {

    @Test
    public void solve() {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(12);
        numbers.add(0);
        numbers.add(1);
        numbers.add(78);
        numbers.add(12);
        List<Integer> insertparams=new ArrayList<>();
        insertparams.add(4);
        insertparams.add(23);
        List<Integer> deleteparams=new ArrayList<>();
        deleteparams.add(0);
        Map<String, List<Integer>> queries=new HashMap<>();
        queries.put("Insert",insertparams);
        queries.put("Delete",deleteparams);
        Assert.assertEquals("0 1 78 12 23",new One().solve(numbers,queries));

    }
}