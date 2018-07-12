public class RollingDice {

    public static int[] roll(int n) {
        int[] rollArray = new int [n];
        for (int i = 0; i < rollArray.length; i++) {
            int rolls = (int) Math.ceil(6 * Math.random());
            rollArray[i] = rolls;
        }
        return rollArray;
    }
}