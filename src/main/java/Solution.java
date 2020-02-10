import java.util.concurrent.ThreadLocalRandom;

public class Solution {
    public static final int LOWER_RANGE = 3;
    public static final int UPPER_RANGE = 5;
    private static final int[][] ARRAY = new int[3][5];

    private static void fillingArrayWithZeros() {
        for (int i = 0; i < ARRAY.length; i++) {
            for (int j = 0; j < ARRAY[i].length; j++) {
                ARRAY[i][j] = 0;
            }
        }
    }

    private static void replacingZeroesWithinRange() {
        int randomNum = ThreadLocalRandom.current()
                .nextInt(LOWER_RANGE, UPPER_RANGE + 1);
        System.out.println("\n" + randomNum + " elements will be replaced by ones\n");
        for (int i = 0; i < randomNum; i++) {
            int row = Integer.MIN_VALUE;
            int column = Integer.MIN_VALUE;
            do {
                row = ThreadLocalRandom.current().nextInt(0, ARRAY.length);
                column = ThreadLocalRandom.current().nextInt(0, ARRAY[row].length);
            } while (ARRAY[row][column] != 0);
            ARRAY[row][column] = 1;
        }
    }

    private static void printArray() {
        for (int i = 0; i < ARRAY.length; i++) {
            for (int j = 0; j < ARRAY[i].length; j++) {
                System.out.print(ARRAY[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("Array of zeros :");
        printArray();
        fillingArrayWithZeros();
        replacingZeroesWithinRange();
        System.out.println("Changed Array : ");
        printArray();
    }
}
