import java.util.Scanner;
public class Question1_5 {
    // global input scanner
    static Scanner input = new Scanner(System.in);

    // prompt for continue or stop executed question
    public static boolean askAgain(){
        System.out.println("Do you want to Execute this question again then press (y)");
        System.out.print("Otherwise Press0 (b) to go to the main menu)");
        char choice = input.next().toLowerCase().charAt(0);
        return choice == 'y';
    }

    // question 1
    public static void question1(){
        String ssn;
        do {
            System.out.println("--->Executing Question - 1<-------");
            System.out.print("Enter a SSN: ");
            ssn = input.next();

            boolean isValid = true;

            if (ssn.length() != 11){
                isValid = false;
            } else if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-') {
                isValid = false;
            } else {
                for (int i = 0; i < 11; i++) {
                    if (i == 3 || i == 6) continue;
                    if (!Character.isDigit(ssn.charAt(i))) {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid) {
            System.out.println(ssn + " is a valid social security number");
            } else {
                System.out.println(ssn + " is an invalid social security number");
            }

        } while (askAgain());
    }

    // question 2
    public static void question2(){
        String regCode;
        do {
            System.out.println("--->Executing Question - 2<-------");
            System.out.print("Enter two characters: ");
            regCode = input.next().toUpperCase();

            boolean isValid = true;

            if (regCode.length() != 2){
                isValid = false;
            } else if (regCode.charAt(1)>'4' || regCode.charAt(1)<'1') {
                isValid = false;
            } else if (regCode.charAt(0)!='M' && regCode.charAt(0)!='C' && regCode.charAt(0)!='I') {
                isValid = false;
            }

            if (isValid){
                char major = regCode.charAt(0);
                char status = regCode.charAt(1);

                switch (major) {
                    case 'M':
                        System.out.print("Mathematics ");
                        break;
                    case 'C':
                        System.out.print("Computer Science ");
                        break;
                    case 'I':
                        System.out.print("Information Technology ");
                        break;
                    default:
                        break;
                }

                switch (status) {
                    case '1':
                        System.out.println("Freshman");
                        break;
                    case '2':
                        System.out.println("Sophomore");
                        break;
                    case '3':
                        System.out.println("Junior");
                        break;
                    case '4':
                        System.out.println("Senior");
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Invalid input");
            }
        } while (askAgain());
    }

    // maiin method
    public static void main(String[] args) {
    int option;

    do {
        System.out.println("\n--->Main Menu (Assignment-3)<-------");
        System.out.println("1 - Question-1");
        System.out.println("2 - Question-2");
        System.out.println("3 - Question-3");
        System.out.println("4 - Question-4");
        System.out.println("5 - Question-5");
        System.out.println("Press option (1-5) to execute the program and Press 0 to Exit");
        System.out.print("Enter your option: ");

        if (input.hasNextInt()) {
            option = input.nextInt();

            switch (option) {
                case 1: question1(); break;
                case 2: question2(); break;
                // case 3: question3(); break;
                // case 4: question4(); break;
                // case 5: question5(); break;
                case 0: System.out.println("Exiting... Good Bye!"); break;
                default: System.out.println("Invalid option! Try again.");
            }
        } else {
            System.out.println("Invalid input! Please enter a number (0-5).");
            input.next();
            option = -1;
        }

    } while (option != 0);
    }
}