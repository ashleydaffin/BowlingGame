
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    @DisplayName("Test for zero score gutter game")
    public void testForGutterGameScoreIsZero(){
        BowlingGame game = new BowlingGame();
        for (int i=0; i<20; i++)
            game.roll(0);
        assertEquals(0, game.score());
    }

    @Test
    @DisplayName("Test for score to equal 20, if each frame has a score of 1")
    public void testForAllOnesScored(){
        BowlingGame game = new BowlingGame();
        for(int i=0; i<20; i++)
            game.roll(1);
        assertEquals(20, game.score());
    }
}
