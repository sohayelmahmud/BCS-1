import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double solarPrice = 7, companyPrice = 60, solarUnit, companyUnit, actualBill, savedBill, onlyCompanyBill;

        System.out.print("How many units consumed from Solar: ");
        solarUnit = input.nextDouble();
        System.out.print("How many units consumed from Company: ");
        companyUnit = input.nextDouble();

        actualBill = solarPrice * solarUnit + companyPrice * companyUnit;
        onlyCompanyBill = (solarUnit + companyUnit) * companyPrice;
        savedBill = onlyCompanyBill - actualBill;

        System.out.println("Bill, if all unit comes from company: " + onlyCompanyBill + " Rs");
        System.out.println("Your actual bill: " + actualBill + " Rs");
        System.out.println("You saved: " + savedBill + " Rs");

        input.close();
    }
}
