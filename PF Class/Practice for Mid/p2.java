import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f = 0, s = 0, t = 0;
        int n;

        while (true) {
            System.out.print("Enter salary (enter 0 to stop): ");
            n = input.nextInt();
            if (n == 0) break;
            if (n > f) {
                t = s;
                s = f;
                f = n;
            } else if (n > s && n != f) {
                t = s;
                s = n;
            } else if (n > t && n != s && n != f) {
                t = n;
            }
        }
        
        System.out.println("Top 3 Salaries: " + f + ", " + s + ", " + t);
        input.close();
    }
}