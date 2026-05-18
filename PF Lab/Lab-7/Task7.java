import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter n: ");
        int userN = input.nextInt();

        printMatrix(userN);

        input.close();
    }

    // method that displays an n-by-n matrix with random 0s and 1s
    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int randomValue = (int) (Math.random() * 2);
                System.out.print(randomValue + " ");
            }
            System.out.println();
        }
    }
}