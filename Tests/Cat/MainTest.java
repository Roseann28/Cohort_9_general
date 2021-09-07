package Cat;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    @Test
    public void compare() {
        List<List<String>> inputs=new ArrayList<>();
        List<String> objects=new ArrayList<>();
        objects.add("amy");
        objects.add("100");
        inputs.add(objects);
        List<String> objects1=new ArrayList<>();
        objects1.add("david");
        objects1.add("100");
        inputs.add(objects1);
        List<String> objects2=new ArrayList<>();
        objects2.add("heraldo");
        objects2.add("50");
        inputs.add(objects2);
        List<String> objects3=new ArrayList<>();
        objects3.add("aakansha");
        objects3.add("75");
        inputs.add(objects3);
        List<String> objects4=new ArrayList<>();
        objects4.add("aleksa");
        objects4.add("150");
        inputs.add(objects4);

        List<List<String>> inputsresult=new ArrayList<>();
        inputsresult.add(objects4);
        inputsresult.add(objects);
        inputsresult.add(objects1);
        inputsresult.add(objects3);
        inputsresult.add(objects2);
        //Assert.assertEquals(inputsresult,new Sorting().compare(inputs));

    }
}