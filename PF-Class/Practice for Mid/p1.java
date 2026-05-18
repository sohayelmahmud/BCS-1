import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        double salary, t_salary, avg;

        System.out.print("enter total emplyee: ");
        int t_emplyee = input.nextInt();
        input.nextLine(); 
        for (int i = 1; i <= t_emplyee; i++) {
            t_salary = 0;
            System.out.print("enter the name: ");
            name = input.nextLine(); 
            for (int j = 1; j <= 4; j++) {
                System.out.print("enter salary for month " + j + ": ");
                salary = input.nextDouble();
                t_salary += salary;
            }
            input.nextLine(); 
            avg = t_salary / 4;
            System.out.println("name: " + name);
            System.out.println("total: " + t_salary);
            System.out.println("avg: " + avg);        }
        input.close();
    }
}