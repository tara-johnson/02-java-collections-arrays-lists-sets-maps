import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TallyingElectionTest {

    @Test
    void winnerJohn() {
        String[] votes = { "john", "johnny", "jackie",
                "johnny", "john", "jackie",
                "jamie", "jamie", "john",
                "johnny", "jamie", "johnny",
                "john" };
        String expected = "john";

        String result = TallyingElection.TallyingElection(votes);
        assertEquals(expected, result);
    }

    @Test
    void winnerBush() {
        String[] votes = { "bush", "bush", "bush",
                "shrub", "hedge", "shrub",
                "bush", "hedge", "bush" };
        String expected = "bush";

        String result = TallyingElection.TallyingElection(votes);
        assertEquals(expected, result);
    }

    @Test
    void winnerPUBG() {
        String[] votes = { "PUBG", "PUBG", "PUBG",
                "PUBG", "PUBG", "PUBG",
                "fortnite", "PUBG", "PUBG"};
        String expected = "PUBG";

        String result = TallyingElection.TallyingElection(votes);
        assertEquals(expected, result);
    }
}