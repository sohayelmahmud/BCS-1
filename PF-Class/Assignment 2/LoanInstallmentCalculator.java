
public class LoanInstallmentCalculator {
    public static void main(String[] args) {

        double principal = 1200000, annualRate = 12.0;
        int years = 5;

        double r = (annualRate / 100) / 12;
        int n = years * 12;

        double monthlyInstallment = (principal * r) / (1 - Math.pow(1 + r, -n));

        System.out.printf("Monthly Installment: Rs. %,.2f%n", monthlyInstallment);
    }
}
