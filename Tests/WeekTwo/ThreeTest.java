package WeekTwo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ThreeTest {

    @Test
    public void ans() {
        int[] a={203,204,205,206,207,208,203,204,205,206};
        int[] b={203,204,204,205,206,207,205,208,203,206,205,206,204};
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(204);
        arrayList.add(205);
        arrayList.add(206);
        Assert.assertEquals(arrayList,new Three().solve(a,b));
    }
}