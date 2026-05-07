import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-10): ");
        int number = sc.nextInt();

        if (number == 1) {
            System.out.println("Roman numeral: I");
        } else if (number == 2) {
            System.out.println("Roman numeral: II");
        } else if (number == 3) {
            System.out.println("Roman numeral: III");
        } else if (number == 4) {
            System.out.println("Roman numeral: IV");
        } else if (number == 5) {
            System.out.println("Roman numeral: V");
        } else if (number == 6) {
            System.out.println("Roman numeral: VI");
        } else if (number == 7) {
            System.out.println("Roman numeral: VII");
        } else if (number == 8) {
            System.out.println("Roman numeral: VIII");
        } else if (number == 9) {
            System.out.println("Roman numeral: IX");
        } else if (number == 10) {
            System.out.println("Roman numeral: X");
        } else {
            System.out.println("Error: Number outside the range of 1 through 10.");
        }
    }
}