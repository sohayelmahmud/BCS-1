import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight, hight, bmi;

        System.out.print("What's your weight: ");
        weight = input.nextDouble();
        System.out.print("What's your hight: ");
        hight = input.nextDouble();

        bmi = weight / (hight * hight);

        System.out.printf("Your BMI is: %.2f" , bmi);

        input.close();
    }
}
