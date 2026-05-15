import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students in class a: ");
        int a = input.nextInt();
        System.out.print("Enter number of students in class b: ");
        int b = input.nextInt();
        System.out.print("Enter number of students in class c: ");
        int c = input.nextInt();

        int desksA = (a / 2) + (a % 2);
        int desksB = (b / 2) + (b % 2);
        int desksC = (c / 2) + (c % 2);

        int totalDesks = desksA + desksB + desksC;

        System.out.println("Total desks to be purchased: " + totalDesks);
    }
}