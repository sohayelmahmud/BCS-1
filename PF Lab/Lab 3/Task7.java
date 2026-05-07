import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int PRICE_A = 20;
        final int PRICE_B = 15;
        final int PRICE_C = 10;
        final int PRICE_D = 5;

        System.out.print("Enter number of Class A tickets sold: ");
        int soldA = input.nextInt();
        System.out.print("Enter number of Class B tickets sold: ");
        int soldB = input.nextInt();
        System.out.print("Enter number of Class C tickets sold: ");
        int soldC = input.nextInt();
        System.out.print("Enter number of Class D tickets sold: ");
        int soldD = input.nextInt();

        int incomeA = soldA * PRICE_A;
        int incomeB = soldB * PRICE_B;
        int incomeC = soldC * PRICE_C;
        int incomeD = soldD * PRICE_D;

        int totalIncome = incomeA + incomeB + incomeC + incomeD;

        System.out.println("Income from Class A: $" + incomeA);
        System.out.println("Income from Class B: $" + incomeB);
        System.out.println("Income from Class C: $" + incomeC);
        System.out.println("Income from Class D: $" + incomeD);
        System.out.println("Total income generated: $" + totalIncome);
    }
}