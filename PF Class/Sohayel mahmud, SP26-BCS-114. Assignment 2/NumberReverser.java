import java.util.Scanner;

public class NumberReverser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, reversedNumber = 0, digit;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number != 0) {
            digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);

        input.close();
    }
}
