import java.util.Scanner;
import java.util.InputMismatchException;

public class Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] userArray = new int[10];

        System.out.println("enter 10 integer values:");
        for (int i = 0; i < userArray.length; i++) {
            boolean isValidElement = false;
            while (!isValidElement) {
                try {
                    System.out.print("element " + (i + 1) + ": ");
                    userArray[i] = input.nextInt();
                    isValidElement = true;
                } catch (InputMismatchException e) {
                    System.out.println("invalid input! please enter an integer only.");
                    input.nextLine(); 
                }
            }
        }

        // try to accept an index and display the corresponding value
        try {
            System.out.print("\nenter an index to display the value: ");
            int searchIndex = input.nextInt();
            
            int value = getValueAtIndex(userArray, searchIndex);
            System.out.println("value at index " + searchIndex + " is: " + value);
        } catch (InputMismatchException e) {
            System.out.println("error: index must be an integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error: index is out of bounds! please enter an index between 0 and 9.");
        }

        input.close();
    }

    public static int getValueAtIndex(int[] arr, int index) {
        return arr[index];
    }
}