import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter an integer: ");
        int userNumber = input.nextInt();

        if (isPalindrome(userNumber)) {
            System.out.println(userNumber + " is a palindrome.");
        } else {
            System.out.println(userNumber + " is not a palindrome.");
        }

        input.close();
    }

    // method to return true if number is a palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    // method to return the reversal of an integer
    public static int reverse(int number) {
        int reversedNum = 0;
        boolean isNegative = number < 0;
        number = Math.abs(number);

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNum = (reversedNum * 10) + lastDigit;
            number /= 10;
        }

        return isNegative ? -reversedNum : reversedNum;
    }
}