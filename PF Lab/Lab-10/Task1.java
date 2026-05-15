import java.util.Scanner;

public class Task1 {
    static Scanner input = new Scanner(System.in);

    // funtion for taking input for 2d array
    public static int[][] input2DArray() {
        int rows = 3, cols = 4;
        int[][] array = new int[rows][cols];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "] [" + j + "]: ");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }

    // function for finding the maximum sum of row
    public static int[] maxSumRow(int[][] array) {
        int maxRowSum = -999999999;
        int maxRowIndex = -1;

        for (int i = 0; i < array.length; i++) {
            int currentRowSum = 0;

            for (int j = 0; j < array[i].length; j++) {
                currentRowSum += array[i][j];
            }
            if (currentRowSum > maxRowSum) {
                maxRowSum = currentRowSum;
                maxRowIndex = i + 1;
            }
        }
        return new int[] { maxRowSum, maxRowIndex };
    }

    // funtion for finding the maximum sum of column
    public static int[] maxSumColumn(int[][] array) {
        int maxColSum = -999999999;
        int maxColIndex = -1;

        for (int j = 0; j < array[0].length; j++) {
            int currentColSum = 0;
            for (int i = 0; i < array.length; i++) {
                currentColSum += array[i][j];
            }
            if (currentColSum > maxColSum) {
                maxColSum = currentColSum;
                maxColIndex = j + 1;
            }
        }
        return new int[] { maxColSum, maxColIndex };
    }

    public static void main(String[] args) {
        System.out.println("Enter your 3x4 2D Array");
        int[][] array = input2DArray();

        int[] resultRow = maxSumRow(array);
        int[] resultCol = maxSumColumn(array);

        System.out.println(
                "The row number having maximum sum is: " + resultRow[1] + " and the summation is: " + resultRow[0]);
        System.out.println(
                "The column number having maximum sum is: " + resultCol[1] + " and the summation is: " + resultCol[0]);
    }
}