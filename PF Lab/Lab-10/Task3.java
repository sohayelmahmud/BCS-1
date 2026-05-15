import java.util.Scanner;

public class Task3 {
    static Scanner input = new Scanner(System.in);

    // take the first 2d array as 3x4
    public static int[][] inputArray1() {
        int rows = 3, cols = 4;
        int[][] array1 = new int[rows][cols];
        System.out.println("Enter your first 3x4 array.");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element for : [" + i + "] [" + j + "]: ");
                array1[i][j] = input.nextInt();
            }
        }
        return array1;
    }

    // take the 2nd 2D array as 4x3
    public static int[][] inputArray2() {
        int rows = 4, cols = 3;
        int[][] array2 = new int[rows][cols];
        System.out.println("Enter your second 4x3 array.");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element for: [" + i + "] [" + j + "]: ");
                array2[i][j] = input.nextInt();
            }
        }
        return array2;
    }

    // multiply array1 & array2
    public static int[][] multiplyArrays(int[][] array1, int[][] array2) {
        int[][] resultArray = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    resultArray[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return resultArray;
    }

    // print a 2d array
    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array1 = inputArray1();
        int[][] array2 = inputArray2();

        System.out.println("Here is the multiplied Array of both arrays.");
        int[][] result = multiplyArrays(array1, array2);
        print2DArray(result);
    }
}
