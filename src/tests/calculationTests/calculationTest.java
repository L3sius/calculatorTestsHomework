package tests.calculationTests;

import calculations.calculateSubtraction;
import calculations.calculateSum;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class calculationTest {

    @Mock
    private double firstNumber;
    @Mock
    private double secondNumber;
    @InjectMocks
    private calculateSum calcSum;
    @InjectMocks
    private calculateSubtraction calcSub;
    @Test
    public void returnSum_test(){
       calcSum = new calculateSum(10.5,25.5);
       double result = calcSum.calculate();
       assertEquals(result, 36, 0.02); //This asserts that the actual value is within
    }                                              // 0.02 of the expected value?
    @Test
    public void returnSub_test(){
        calcSub = new calculateSubtraction(15.0,25.0);
        double result = calcSub.calculate();
        assertEquals(result,-10.0,0.02);
    }
}
