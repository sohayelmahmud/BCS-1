import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking input for salary
        System.out.print("Enter Monthly Salary (0 to exit): ");
        double monthlySalary = input.nextDouble();

        // Condition: Using sentinel while
        while (monthlySalary != 0) {
            // Calculating annual income
            double annualIncome = monthlySalary * 12;
            double annualTax = 0;

            // Determining annual tax using
            if (annualIncome <= 600000) {
                annualTax = 0;
            } else if (annualIncome <= 1200000) {
                annualTax = (annualIncome - 600000) * 0.01;
            } else if (annualIncome <= 2200000) {
                annualTax = 6000 + (annualIncome - 1200000) * 0.11;
            } else if (annualIncome <= 3200000) {
                annualTax = 116000 + (annualIncome - 2200000) * 0.23;
            } else if (annualIncome <= 4100000) {
                annualTax = 346000 + (annualIncome - 3200000) * 0.30;
            } else {
                annualTax = 616000 + (annualIncome - 4100000) * 0.35;
            }

            // Calculating monthly deductions
            double monthlyTax = annualTax / 12;
            double netMonthlySalary = monthlySalary - monthlyTax;

            // Displaying the results
            System.out.printf("Annual Income: %.1f\n" , annualIncome);
            System.out.printf("Total annual tax payable: %.1f\n" , annualTax);
            System.out.printf("Monthly tax deduction: %.1f\n" , monthlyTax);
            System.out.printf("Net monthly salary after tax: %.1f\n" , netMonthlySalary);
            System.out.println("-------------------------------------------");

            // Prompting again for the next employee
            System.out.print("Enter Monthly Salary (0 to exit): ");
            monthlySalary = input.nextDouble();
        }

        System.out.println("Program Terminated...");
        input.close();
    }
}