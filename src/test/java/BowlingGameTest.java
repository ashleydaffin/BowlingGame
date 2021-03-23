
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {

    @Test
    @DisplayName("Test for zero score gutter game")
    public void testForGutterGameScoreIsZero(){
        BowlingGame game = new BowlingGame();
        for (int i=0; i<20; i++)
            game.roll(0);
    }
}
