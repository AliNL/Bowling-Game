import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BallTest {
    @Test
    public void getScore() throws Exception {
        assertEquals(3, new Ball('3').getScore());
        assertEquals(10, new Ball('X').getScore());
    }
}