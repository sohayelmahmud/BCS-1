import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number for a: "); int a1 = sc.nextInt();
        System.out.print("Enter second number for a: "); int a2 = sc.nextInt();
        if (a1 < a2) System.out.println("Minimum of " + a1 + " and " + a2 + " is: " + a1);
        else System.out.println("Minimum of " + a1 + " and " + a2 + " is: " + a2);

        System.out.print("Enter first number for b: "); int b1 = sc.nextInt();
        System.out.print("Enter second number for b: "); int b2 = sc.nextInt();
        if (b1 < b2) System.out.println("Minimum of " + b1 + " and " + b2 + " is: " + b1);
        else System.out.println("Minimum of " + b1 + " and " + b2 + " is: " + b2);

        System.out.print("Enter value of X for sign function: "); int x = sc.nextInt();
        if (x > 0) System.out.println("Sign of " + x + " is: 1");
        else if (x < 0) System.out.println("Sign of " + x + " is: -1");
        else System.out.println("Sign of " + x + " is: 0");

        System.out.print("Enter first number for d: "); int c1 = sc.nextInt();
        System.out.print("Enter second number for d: "); int c2 = sc.nextInt();
        System.out.print("Enter third number for d: "); int c3 = sc.nextInt();
        int min = c1;
        if (c2 < min) min = c2;
        if (c3 < min) min = c3;
        System.out.println("Minimum of " + c1 + ", " + c2 + " and " + c3 + " is: " + min);
    }
}