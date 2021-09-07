package Practice_Exam;

import org.junit.Assert;
import org.junit.Test;

public class ExpenditureTest {

    @Test
    public void total() {
        Assert.assertEquals(100,Expenditure.total(0,0,0,50,50),0);
    }
}