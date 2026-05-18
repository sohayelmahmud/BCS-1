import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter positive real number a: ");
        double userA = input.nextDouble();

        System.out.print("enter non-negative integer n: ");
        int userN = input.nextInt();

        double result = power(userA, userN);
        System.out.println("result: " + result);

        input.close();
    }

    // method to calculate power using recursion
    public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        }
        
        return a * power(a, n - 1);
    }
}