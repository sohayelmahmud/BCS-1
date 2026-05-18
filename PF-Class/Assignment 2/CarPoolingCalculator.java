import java.util.Scanner;

public class CarPoolingCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalMiles, costPerGallon, milesPerGallon, parkingFees, tolls, dailyTotal;

        System.out.print("Total miles driven per day: ");
        totalMiles = input.nextDouble();
        System.out.print("Cost per gallon of gasoline: ");
        costPerGallon = input.nextDouble();
        System.out.print("Average miles per gallon: ");
        milesPerGallon = input.nextDouble();
        System.out.print("Parking fees per day: ");
        parkingFees = input.nextDouble();
        System.out.print("Tolls per day: ");
        tolls = input.nextDouble();

        dailyTotal = (totalMiles / milesPerGallon) * costPerGallon + parkingFees + tolls;

        System.out.println("Daily driving cost: Rs. " + dailyTotal);

        input.close();

    }
}
