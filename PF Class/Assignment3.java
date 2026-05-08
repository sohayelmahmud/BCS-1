import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int option;

    do {
        System.out.println("\n---Main Menu (Assignment-2)-------");
        System.out.println("1 – Question-1");
        System.out.println("2 – Question-2");
        System.out.println("3 – Question-3");
        System.out.println("4 – Question-4");
        System.out.println("5 – Question-5");
        System.out.println("Press option (1-5) to execute the program and Press 0 to Exit");
        System.out.print("Enter your option: ");

        option = input.nextInt();

        switch (option) {
            // case 1: question1(); break;
            // case 2: question2(); break;
            // case 3: question3(); break;
            // case 4: question4(); break;
            // case 5: question5(); break;
            case 0: System.out.println("Exiting... Good Bye!"); break;
            default: System.out.println("Invalid option! Try again.");
        }
    } while (option != 0);
    }
}