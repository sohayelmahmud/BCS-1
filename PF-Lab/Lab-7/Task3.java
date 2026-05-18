import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter three numbers: ");
        double userNum1 = input.nextDouble();
        double userNum2 = input.nextDouble();
        double userNum3 = input.nextDouble();

        displaySortedNumbers(userNum1, userNum2, userNum3);

        input.close();
    }

    // method to display three numbers in increasing order
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("sorted numbers: " + num1 + " " + num2 + " " + num3);
    }
}