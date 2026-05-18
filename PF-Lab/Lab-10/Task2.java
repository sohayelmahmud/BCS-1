import java.util.Scanner;

public class Task2 {
    static Scanner input = new Scanner(System.in);

    // check for the primes
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // take 2d array input
    public static int[][] input2DArray() {
        int rows = 3, cols = 4;
        int[][] array = new int[rows][cols];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Element [" + i + "] [" + j + "]: ");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }

    // count prime in a row
    public static int countPrimesInRow(int[][] array, int row) {
        int count = 0;
        for (int j = 0; j < array[row].length; j++) {
            if (isPrime(array[row][j]))
                count++;
        }
        return count;
    }

    // count primes in a column
    public static int countPrimesInCol(int[][] array, int col) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i][col]))
                count++;
        }
        return count;
    }

    // check rows and return macount & index
    public static int[] findMaxPrimesInRows(int[][] array) {
        int maxPrimes = -1, index = -1;
        for (int i = 0; i < array.length; i++) {
            int currentCount = countPrimesInRow(array, i);
            if (currentCount > maxPrimes) {
                maxPrimes = currentCount;
                index = i + 1;
            }
        }
        return new int[] { maxPrimes, index };
    }

    // check cols and return maxcount & index
    public static int[] findMaxPrimesInCols(int[][] array) {
        int maxPrimes = -1, index = -1;
        for (int j = 0; j < array[0].length; j++) {
            int currentCount = countPrimesInCol(array, j);
            if (currentCount > maxPrimes) {
                maxPrimes = currentCount;
                index = j + 1;
            }
        }
        return new int[] { maxPrimes, index };
    }

    // main
    public static void main(String[] args) {
        int[][] array = input2DArray();

        int[] rowResult = findMaxPrimesInRows(array);
        int[] colResult = findMaxPrimesInCols(array);

        if (rowResult[0] >= colResult[0]) {
            System.out.println("\nMaximum prime numbers: " + rowResult[0]);
            System.out.println("Found in " + rowResult[1] + " no. Row.");
        } else {
            System.out.println("\nMaximum prime numbers: " + colResult[0]);
            System.out.println("Found in " + colResult[1] + " no. Column.");

        }
    }
}
