public class ArrayOfArrays {

    public static int[] averageWeeklyTemperatures(int[][] weeklyMonthTemperatures) {

        double[] tempArray = new double[weeklyMonthTemperatures.length];

        for (int row = 0; row < weeklyMonthTemperatures.length; row++) {
            int totalByRow = 0;
            double averageByRow = 0;

            for (int col = 0; col < weeklyMonthTemperatures[row].length; col++) {
                totalByRow += weeklyMonthTemperatures[row][col];
                averageByRow = (double) totalByRow / weeklyMonthTemperatures[row].length;
            }
            tempArray[row] += averageByRow;
        }

        double lowestVal = tempArray[0];
        int lowestIndex = 0;

        for (int i = 1; i < tempArray.length; i++) {

            if (tempArray[i] < lowestVal) {
                lowestVal = tempArray[i];
            }

            if (tempArray[i] == lowestVal) {
                lowestIndex = i;
            }
        }
        return weeklyMonthTemperatures[lowestIndex];
    }
}