import java.util.Scanner;
import java.util.InputMismatchException;

public class Task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print("enter two integers: ");
                num1 = input.nextInt();
                num2 = input.nextInt();
                
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("you have entered an invalid input, type integers only.");
                input.nextLine(); 
            }
        }

        int totalSum = sum(num1, num2);
        System.out.println("the sum is: " + totalSum);

        input.close();
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}