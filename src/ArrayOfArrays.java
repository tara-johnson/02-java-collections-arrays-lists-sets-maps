import java.util.Arrays;

public class ArrayOfArrays {
    public static void main(String[] args) {
        // Daily average temperatures for Seattle, October 1-28 2017
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        averageWeeklyTemperatures(weeklyMonthTemperatures);
//        System.out.println(total);
    }

    public static void averageWeeklyTemperatures(int[][] aa) {


        for (int row = 0; row < aa.length; row++) {
            int total = 0;
            for (int col = 0; col < aa[row].length; col++) {
                int value = aa[row][col];
                total += value;
            }
            System.out.println(Arrays.toString(aa[row]));
        }
    }
}