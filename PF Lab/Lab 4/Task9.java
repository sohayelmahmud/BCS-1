import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pennies: ");
        int pennies = sc.nextInt();
        System.out.print("Enter number of nickels: ");
        int nickels = sc.nextInt();
        System.out.print("Enter number of dimes: ");
        int dimes = sc.nextInt();
        System.out.print("Enter number of quarters: ");
        int quarters = sc.nextInt();

        double total = (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);

        if (total == 1.0) {
            System.out.println("Congratulations! You won the game.");
        } else if (total > 1.0) {
            System.out.println("The amount was more than one dollar.");
        } else {
            System.out.println("The amount was less than one dollar.");
        }
    }
}