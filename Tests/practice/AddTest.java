package practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AddTest {

    @Test
    public void solve() {
        int [] array={1,2,3,2};
        List<List<Integer>> finals=new ArrayList<>();
        List<Integer> adds=new ArrayList<>();
        adds.add(0);
        adds.add(2);
        adds.add(1);
        adds.add(3);


        Assert.assertEquals(adds, new Add().solve(array,4));
    }
}