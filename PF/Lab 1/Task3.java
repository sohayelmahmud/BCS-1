import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        final int SECRET = 11;
        final double RATE = 12.50;
        int num1, num2, newNum;
        String name;
        double hoursWorked, wages;
        System.out.print("Enter the first number: ");
        num1 = console.nextInt();
        System.out.print("Enter the second number: ");
        num2 = console.nextInt();
        System.out.println("The value of num1 = " + num1 + " and the value of num2 = " + num2);
        newNum = num1*2 + num2;
        System.out.println("The value of newNum = " + newNum);
        newNum += SECRET;
        System.out.println("The value of newNum after adding the SECRET code = " + newNum);
        System.out.print("Enter the last name: ");
        name = console.next();
        System.out.print("Enter the working hours between 0 to 70: ");
        hoursWorked = console.nextDouble();
        wages = RATE*hoursWorked;

        System.out.println("Name: " + name);
        System.out.println("Pay Rate: $" + RATE);
        System.out.println("Hourse Workes: " + hoursWorked);
        System.out.println("Salary: $" + wages);
    }
}
