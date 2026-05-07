import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight for package 1: ");
        double weight1 = input.nextDouble();
        System.out.print("Enter price for package 1: ");
        double price1 = input.nextDouble();

        System.out.print("Enter weight for package 2: ");
        double weight2 = input.nextDouble();
        System.out.print("Enter price for package 2: ");
        double price2 = input.nextDouble();

        double pricePerUnit1 = price1 / weight1;
        double pricePerUnit2 = price2 / weight2;

        if (pricePerUnit1 < pricePerUnit2) {
            System.out.println("Package 1 has a better price.");
        } else if (pricePerUnit2 < pricePerUnit1) {
            System.out.println("Package 2 has a better price.");
        } else {
            System.out.println("Both packages have the same price.");
        }

        input.close();
    }
}