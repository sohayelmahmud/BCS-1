import java.util.*;

public class Question7 {
    public static Scanner input = new Scanner(System.in);

    // random matrix
    public static int[][] randomArray(int rows) {
        int[][] array = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }
        }
        return array;
    }

    // check rows for same numbers
    public static void checkRows(int[][] array) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            int firstElement = array[i][0];
            boolean allSame = true;

            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] != firstElement) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                System.out.println("All " + firstElement + "s on row " + i);
                found = true;
            }
        }
        if (!found)
            System.out.println("No same numbers on a row");
    }

    // check columns for same numbers
    public static void checkColumns(int[][] array) {
        boolean found = false;
        for (int j = 0; j < array[0].length; j++) {
            int firstElement = array[0][j];
            boolean allSame = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i][j] != firstElement) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                System.out.println("All " + firstElement + "s on column " + j);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No same numbers on a column");
        }
    }

    // check diagonals
    public static void checkDiagonals(int[][] array) {
        int size = array.length;

        // Major Diagonal
        int firstMajor = array[0][0];
        boolean majorSame = true;
        for (int i = 1; i < size; i++) {
            if (array[i][i] != firstMajor) {
                majorSame = false;
                break;
            }
        }
        if (majorSame)
            System.out.println("All " + firstMajor + "s on the major diagonal");
        else
            System.out.println("No same numbers on the major diagonal");

        // Sub-diagonal
        int firstSub = array[0][size - 1];
        boolean subSame = true;
        for (int i = 1; i < size; i++) {
            if (array[i][size - 1 - i] != firstSub) {
                subSame = false;
                break;
            }
        }
        if (subSame)
            System.out.println("All " + firstSub + "s on the sub-diagonal");
        else
            System.out.println("No same numbers on the sub-diagonal");
    }

    // print the matrix
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();

        int[][] array = randomArray(size);
        printArray(array);
        System.out.println();

        checkRows(array);
        checkColumns(array);
        checkDiagonals(array);

        input.close();
    }
}