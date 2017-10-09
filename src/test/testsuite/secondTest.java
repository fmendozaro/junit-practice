import org.junit.Assert;
import org.junit.Test;

public class secondTest {
    @Test
    public void testHWMessage(){
        String hello = "Hello test";
        System.out.println("Suite secondTest is executing...");
        Assert.assertNotNull(hello);
        Assert.assertEquals("Hello test", hello);
    }
}
