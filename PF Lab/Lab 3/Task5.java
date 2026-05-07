import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double CARTON_CAPACITY = 3.78;
        final double COST_PER_LITER = 0.38;
        final double PROFIT_PER_CARTON = 0.27;

        System.out.print("Enter the total amount of milk produced in the morning: ");
        double totalMilk = input.nextDouble();

        int cartonsNeeded = (int) Math.round(totalMilk / CARTON_CAPACITY);

        double totalCost = totalMilk * COST_PER_LITER;

        double totalProfit = cartonsNeeded * PROFIT_PER_CARTON;

        System.out.println("The number of milk cartons needed: " + cartonsNeeded);
        System.out.println("The cost of producing milk: $" + totalCost);
        System.out.println("The profit for producing milk: $" + totalProfit);
    }
}