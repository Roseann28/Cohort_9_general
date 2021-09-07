package Cat;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MainsortTest {

    @Test
    public void solve() {
        List<Object> inputs=new ArrayList<>();
        inputs.add(new Players("amy",100));
        inputs.add(new Players("david",100));
        inputs.add(new Players("heraldo",50));
        inputs.add(new Players("aakansha",75));
        inputs.add(new Players("aleksa",150));

        List<Object> inputsresult=new ArrayList<>();
        inputsresult.add(new Players("aleksa",150));
        inputsresult.add(new Players("amy",100));
        inputsresult.add(new Players("david",100));
        inputsresult.add(new Players("aakansha",75));
        inputsresult.add(new Players("heraldo",50));
        String inputsresult1=inputsresult.toString();
        Assert.assertEquals(inputsresult1,new Mainsort().solve(inputs) );

    }
}