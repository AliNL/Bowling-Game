import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void should_get_full_score_when_all_X() throws Exception {
        assertEquals(300, new Game("X|X|X|X|X|X|X|X|X|X||XX").getScore());
    }

    @Test
    public void should_get_90_when_all_9() throws Exception {
        assertEquals(90, new Game("9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||").getScore());
    }

    @Test
    public void should_get_150_when_all_spare() throws Exception {
        assertEquals(150, new Game("5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||5").getScore());
    }

}