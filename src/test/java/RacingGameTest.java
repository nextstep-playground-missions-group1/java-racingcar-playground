import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class RacingGameTest {
    @Test
    public void runRaceAndGetWinners() {
        RacingGame game = new RacingGame(new String[] {"a", "b"}, 5);
        game.run();
        List<String> winners = game.getWinners();
        assertTrue(winners.contains("a") || winners.contains("b"));
    }
}
