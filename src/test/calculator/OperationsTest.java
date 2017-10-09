package calculator;

import main.calculator.Calc;
import org.junit.*;
import static org.junit.Assert.*;

public class OperationsTest {

    Calc calc = new Calc();
    // delta is to determine the floating numbers precision
    double delta = 0.1, expectedResult = 0, res = 0;

    public OperationsTest() {}

    @BeforeClass
    public static void setUp() throws Exception {}

    @AfterClass
    public static void tearDown() throws Exception {}

    @Test
    public void sum() {
        double[] nums = {1,2,3,4,5,6};
        expectedResult = 21;
        res = calc.sum(nums);
        assertEquals(res, expectedResult, delta);
    }

    @Test
    public void substract() {
        res = calc.subtract(17,5);
        expectedResult = 12;
        assertEquals(res, expectedResult, delta);
    }

    @Test
    public void multiply(){
        double a = 10, b = 34;
        expectedResult = 340;
        res = calc.multiply(a, b);
        assertEquals(res, expectedResult, delta);
    }

    @Test
    public void divide(){
        double numerator = 0, denominator = 0;
        expectedResult = 0;
        res = calc.divide(numerator, denominator);
        assertEquals(res, expectedResult, delta);
        numerator = 10;
        denominator = 2;
        expectedResult = 5;
        res = calc.divide(numerator, denominator);
        assertEquals(res, expectedResult, delta);
    }

}
