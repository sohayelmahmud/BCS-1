import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students (N): ");
        int n = input.nextInt();
        System.out.print("Enter number of apples (K): ");
        int k = input.nextInt();

        int applesPerStudent = k / n;
        int remainingApples = k % n;

        System.out.println("Each student gets: " + applesPerStudent);
        System.out.println("Apples remaining in basket: " + remainingApples);
    }
}