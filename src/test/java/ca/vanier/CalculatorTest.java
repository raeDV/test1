package ca.vanier;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    
    @Test
    public void sumITTest(){
        CalculatorResponse result = Calculator.sumIT("SUM",1,4);
        Assert.assertEquals(5, result);

    }
}
