import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter minutes passed since midnight (N): ");
        int n = input.nextInt();

        int hours = (n / 60) % 24;
        int minutes = n % 60;

        System.out.println(hours + " " + minutes);
    }
}