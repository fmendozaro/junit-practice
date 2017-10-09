package calculator;

import main.calculator.Calc;
import org.junit.*;
import static org.junit.Assert.*;

public class OperationsTest {

    public OperationsTest() {}

    @BeforeClass
    public static void setUpClass() throws Exception {}

    @AfterClass
    public static void tearDownClass() throws Exception {}

    @Test
    public void testSum() throws Exception {
        double[] nums = {1,2,3,4,5,6};
        double expectedRes = 21;
        Calc calc = new Calc();
        double res = calc.sum(nums);
        assertEquals(res, expectedRes, 0.1);
    }

}
