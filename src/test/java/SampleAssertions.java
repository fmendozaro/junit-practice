import org.junit.Test;

import static org.junit.Assert.*;

public class SampleAssertions {

    public SampleAssertions(){

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
        assertFalse("Should be true", true);
    }



}
