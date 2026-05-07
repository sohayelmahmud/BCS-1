public class BuyLaptop {
    public static void main(String[] args) {
        int salary = 50_000, expense = 37_500, laptopPrice = 100_000, savings, monthsNeed;

        savings = salary - expense;
        monthsNeed = laptopPrice / savings;

        if (laptopPrice % savings != 0) {
            monthsNeed += 1;
        }

        System.out.println("Monthly Savings: Rs. " + savings);
        System.out.println("You need " + monthsNeed + " months to buy your Laptop.");
    }
}
