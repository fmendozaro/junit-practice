import org.junit.Assert;
import org.junit.Test;

public class firstTest {
    @Test
    public void testPrintMessage(){
        int num = 5;
        System.out.println("Suite firstTest is executing...");
        Assert.assertEquals(5, num);
    }
}
