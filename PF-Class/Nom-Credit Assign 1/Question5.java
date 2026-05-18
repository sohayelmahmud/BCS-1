import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int customerCount = 0, choice;
        double totalCollection = 0;

        while (true) {
            System.out.print("Enter customer name: ");
            String name = input.next();
            System.out.print("Enter units consumed: ");
            int units = input.nextInt();

            double bill = 0;
            if (units <= 100) {
                bill = units * 5;
            } else if (units <= 200) {
                bill = (100 * 5) + (units - 100) * 10;
            } else {
                bill = (100 * 5) + (100 * 10) + (units - 200) * 20;
            }

            System.out.println("Bill for " + name + " is " + bill + ": Rs. ");
            
            customerCount += 1;
            totalCollection += bill;

            System.out.print("Enter another customer? (1 to yes/ 0 to stop): ");
            choice = input.nextInt();
            if (choice == 0) break;
        }

        System.out.println("\nTotal customers: " + customerCount);
        System.out.println("Total collection: " + totalCollection + "Rs. ");
        
        input.close();
    }
}