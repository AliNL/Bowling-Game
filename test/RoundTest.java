import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class RoundTest {
    @Test
    public void isStrike() throws Exception {
        assertFalse(new Round("3/").isStrike());
        assertFalse(new Round("34").isStrike());
        assertTrue(new Round("X").isStrike());
    }

    @Test
    public void isSpare() throws Exception {
        assertTrue(new Round("3/").isSpare());
        assertFalse(new Round("34").isSpare());
        assertFalse(new Round("X").isSpare());
    }

}