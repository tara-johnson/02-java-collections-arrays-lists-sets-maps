import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RollingDiceTest {

    @Test
    void emptyRoll() {
        int n = 0;
        int[] result = RollingDice.roll(n);

        int expected = n;
        assertEquals(expected, result.length);
    }

    @Test
    void roll() {
        int n = 10;
        int[] result = RollingDice.roll(n);

        int expected = n;
        assertEquals(expected, result.length);
    }
}