import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle 1: ");
        double length1 = sc.nextDouble();
        System.out.print("Enter width of rectangle 1: ");
        double width1 = sc.nextDouble();

        System.out.print("Enter length of rectangle 2: ");
        double length2 = sc.nextDouble();
        System.out.print("Enter width of rectangle 2: ");
        double width2 = sc.nextDouble();

        double area1 = length1 * width1;
        double area2 = length2 * width2;

        if (area1 > area2) {
            System.out.println("Rectangle 1 has the greater area. And the are is: " + area1);
        } else if (area2 > area1) {
            System.out.println("Rectangle 2 has the greater area. And the area is: " + area2);
        } else {
            System.out.println("The areas are the same. And the areas are: " + area1);
        }
    }
}