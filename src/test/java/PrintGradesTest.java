import org.junit.Test;

import static org.junit.Assert.*;

public class PrintGradesTest {
    @Test
    public void gradesTest(){
        PrintGrades pg = new PrintGrades();
        String res = pg.print(95);
        assertEquals("You got an A!", res);
    }
}