package tests.calculatorTest;

import com.company.Calculator;
import com.company.MyReader;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class CalculatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Mock
    private static double firstNumber;
    @Mock
    private static double secondNumber;
    @InjectMocks
    private Calculator calculator;

    @Test
    public void test_fail_isNumber() {
        expectedException.expect(NumberFormatException.class);
        expectedException.expectMessage("Not a number entered!");

        MyReader input = new MyReader();

        try {
            input.setInput("Not a number");
            Double.parseDouble(input.getInput());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Not a number entered!");
        }
    }
}
