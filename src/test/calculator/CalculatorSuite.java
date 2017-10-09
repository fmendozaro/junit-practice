package calculator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    OperationsTest.class,
    MainTest.class
})
public class CalculatorSuite {

    @BeforeClass
    public static void setUpClass() throws Exception{}

    @AfterClass
    public static void tearDownClass() throws Exception{}


}
