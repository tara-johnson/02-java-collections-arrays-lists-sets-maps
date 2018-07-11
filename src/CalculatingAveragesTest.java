import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatingAveragesTest {

    @Test
    void calculateDecimal() {
        int[] arr = {42, 15, 3, 6, 9, 14, 77, 8, 10, 2};
        double result = CalculatingAverages.calculateAverage(arr);

        double expected = 18.6;
        assertEquals(expected, result);
    }

    @Test
    void calculateWhole() {
        int[] arr = {5, 10, 15, 20, 25};
        double result = CalculatingAverages.calculateAverage(arr);

        double expected = 15;
        assertEquals(expected, result);
    }

    @Test
    void calculateMultiDecimal() {
        int[] arr = {8, 9, 11};
        double result = CalculatingAverages.calculateAverage(arr);

        double expected = 9.333333333333332;
        assertEquals(expected, result);
    }

}