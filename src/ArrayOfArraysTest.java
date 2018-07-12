import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfArraysTest {

    @Test
    void averageWeeklyTemperatures() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String result = Arrays.toString(ArrayOfArrays.averageWeeklyTemperatures(weeklyMonthTemperatures));

        String expected = Arrays.toString(new int[] {55, 54, 60, 53, 59, 57, 61});
        assertEquals(expected, result);
    }
}