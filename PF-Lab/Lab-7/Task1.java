import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userNumber = input.nextInt();

        int sum = sumDigits(userNumber);
        System.out.println("The sum of digits is: " + sum);

        System.out.print("The reversal is: ");
        reverse(userNumber);
        System.out.println();

        input.close();
    }

    // method to compute the sum of the digits in an integer
    public static int sumDigits(long n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // method to display an integer in reverse order
    public static void reverse(int number) {
        if (number == 0) {
            System.out.print(0);
            return;
        }
        
        if (number < 0) {
            System.out.print("-");
            number = Math.abs(number);
        }

        while (number > 0) {
            System.out.print(number % 10);
            number /= 10;
        }
    }
}