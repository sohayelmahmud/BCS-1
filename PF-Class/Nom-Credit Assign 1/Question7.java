import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double balance = 10000.0;
        int choice;

        OUTER:
        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Select an option (Enter 1-4): ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    {
                        System.out.print("Enter amount to deposit: ");
                        double amount = input.nextDouble();
                        balance += amount;
                        break;
                    }
                case 2:
                    {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = input.nextDouble();
                        if (amount > balance) {
                            System.out.println("Insufficient Balance.");
                        } else {
                            balance -= amount;
                            System.out.println("Successfully withdrawn.");
                        }
                        break;
                    }
                case 3:
                    System.out.println("Current Balance: Rs. " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break OUTER;
                default:
                    System.out.println("Invalid menu choice. Please try again.");
                    break;
            }
        }
        
        input.close();
    }
}