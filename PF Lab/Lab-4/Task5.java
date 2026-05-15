import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Output: 3");
        } else if (a == b || b == c || a == c) {
            System.out.println("Output: 2");
        } else {
            System.out.println("Output: 0");
        }
    }
}