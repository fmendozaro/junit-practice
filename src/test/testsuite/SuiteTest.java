import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Test1.class,
        Test2.class
})

public class SuiteTest {

    public SuiteTest(){

    }

    @BeforeClass
    public static void setUpClass(){

    }


    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testMain() {

    }

}
