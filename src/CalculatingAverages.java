public class CalculatingAverages {
    public static double calculateAverage(int[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += (double) arr[i]/arr.length;
        }
        return total;
    }
}