import org.junit.Test;

import static org.junit.Assert.*;

public class SampleAssertionsTest {

    public SampleAssertionsTest(){

    }

    @Test
    public void testAssertArrayEquals(){
        byte[] expected = "test".getBytes();
        byte[] actual = "test".getBytes();
        assertArrayEquals("failure - byte arrays are not the same", expected, actual);
    }

    @Test
    public void testAssertEquals(){
        assertEquals("They are not equals", "text", "text");
    }

    @Test
    public void testAssertFalse(){
        assertFalse("Should be true", false);
    }

    @Test
    public void testAssertNull(){
        assertNotNull("should not be null", new Object());
    }

    @Test
    public void testAssertNotSame(){
        assertNotSame("should not be the same  object", new Object(), new Object());
    }

    @Test
    public void testAssetNull(){
        assertNull("should be null", null);
    }

    @Test
    public void testAssertSame(){
        Integer number = Integer.valueOf(34);
        assertSame("should be the same", number, number);
    }

    @Test
    public void testAssetTrue(){
        assertTrue("failure: should be true", true);
    }

}
