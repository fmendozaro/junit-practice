import org.junit.Assert;
import org.junit.Test;

public class Test2 {
    @Test
    public void testHWMessage(){
        String hello = "Hello test";
        System.out.println("Suite Test2 is executing...");
        Assert.assertNotNull(hello);
        Assert.assertEquals("Hello test", hello);
    }
}
