import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter pay rate per hour: ");
        double payRate = input.nextDouble();
        System.out.print("Enter number of hours worked each week: ");
        double hoursPerWeek = input.nextDouble();

        double totalIncomeBeforeTax = payRate * hoursPerWeek * 5;
        double netIncome = totalIncomeBeforeTax * (1 - 0.14);

        double clothesSpending = netIncome * 0.10;
        double schoolSuppliesSpending = netIncome * 0.01;

        double remainingMoney = netIncome - (clothesSpending + schoolSuppliesSpending);
        double savingsBondsSpending = remainingMoney * 0.25;
        double parentsContribution = savingsBondsSpending * 0.50;

        System.out.println("Income before taxes: $" + totalIncomeBeforeTax);
        System.out.println("Income after taxes: $" + netIncome);
        System.out.println("Money spent on clothes and accessories: $" + clothesSpending);
        System.out.println("Money spent on school supplies: $" + schoolSuppliesSpending);
        System.out.println("Money spent to buy savings bonds: $" + savingsBondsSpending);
        System.out.println("Money parents spend for additional savings bonds: $" + parentsContribution);
    }
}