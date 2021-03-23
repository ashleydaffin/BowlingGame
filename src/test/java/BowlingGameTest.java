
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    private BowlingGame game;

    @BeforeEach
   protected void setUp() {
        game = new BowlingGame();
    }

    public void rollMany(int n, int pins){
        for (int i=0; i<n; i++)
            game.roll(pins);
    }

    @Test
    @DisplayName("Test for zero score gutter game")
    public void testForGutterGameScoreIsZero() {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    @DisplayName("Test for score to equal 20, if each frame has a score of 1")
    public void testForAllOnesScored() {
        rollMany(20,1);
        assertEquals(20, game.score());
    }
}
