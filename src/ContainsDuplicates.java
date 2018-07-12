public class ContainsDuplicates {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 6, 6, 7, 8, 9, 10};
//        containsDuplicates(arr);
//    }

    public static boolean containsDuplicates(int[] arr) {
        boolean isDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isDuplicate = true;
                }
            }
        }
        return isDuplicate;
    }
}