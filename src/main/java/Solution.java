import java.util.concurrent.ThreadLocalRandom;

public class Solution {
    public static final int ROWS = 3;
    public static final int COLUMNS = 5;
    private static final int[][] ARRAY = new int[3][5];

    private static void fillingArrayWithZeros() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                ARRAY[i][j] = 0;
            }
        }
    }

    private static void replacingZeroesWithinRange() {
        int randomNum = ThreadLocalRandom.current()
                .nextInt(ROWS, COLUMNS + 1);
        System.out.println("\n" + randomNum + " elements will be replaced by ones\n");
        for (int i = 0; i < randomNum; i++) {
            int row, column;
            do {
                row = ThreadLocalRandom.current().nextInt(0, ROWS);
                column = ThreadLocalRandom.current().nextInt(0, COLUMNS);
            } while (ARRAY[row][column] != 0);
            ARRAY[row][column] = 1;
        }
    }

    private static void printArray() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
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
