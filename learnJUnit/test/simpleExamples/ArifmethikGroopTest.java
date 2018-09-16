package simpleExamples;
import static org.junit.Assert.*;
import org.junit.*;

import static org.junit.Assert.*;

public class ArifmethikGroopTest {

    ArifmethikGroop arifmethikGroop = new ArifmethikGroop();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(timeout = 2)
    public void add() {
        int expected = 10;
        int actual = arifmethikGroop.add(5,5);
        assertEquals(expected, actual);
    }

    @Test (expected = Exception.class)
    public void div() {
       arifmethikGroop.div(2,0);
    }
}