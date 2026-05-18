import java.util.*;

public class Question6 {
    public static Scanner input = new Scanner(System.in);

    // take the matrix from user
    public static int[][] inputArray(int row, int column) {
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter element for [" + i + "] [" + j + "]: ");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }

    // multiplied matrix
    public static int[][] multipliedArrays(int[][] array1, int[][] array2) {
        int[][] array = new int[array1.length][array2[0].length];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int k = 0; k < array1[0].length; k++) {
                    array[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return array;
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
        System.out.println("=============================================================================");
        int row1, row2, column1, column2;
        System.out.print("Enter rows for first Matrix: ");
        row1 = input.nextInt();
        System.out.print("Enter columns for first Matrix: ");
        column1 = input.nextInt();

        System.out.print("Enter rows for second Matrix: ");
        row2 = input.nextInt();
        System.out.print("Enter columns for second Matrix: ");
        column2 = input.nextInt();

        if (column1 != row2) {
            System.out.println("Multiplication isn't possible! Column of Matrix 1 must match Row of Matrix 2.");
            System.out.println("=============================================================================");

        } else {
            System.out.println("\nEnter elements for your first array: ");
            System.out.println("=======================================");
            int[][] array1 = inputArray(row1, column1);

            System.out.println("\nEnter elements for your second array: ");
            System.out.println("=======================================");
            int[][] array2 = inputArray(row2, column2);

            System.out.println("\nResultant Matrix:");
            System.out.println("===================");

            int[][] resultArray = multipliedArrays(array1, array2);
            printArray(resultArray);
        }

        input.close();

    }
}
