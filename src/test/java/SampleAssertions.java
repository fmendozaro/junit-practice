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

}
