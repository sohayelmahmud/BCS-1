import java.util.Scanner;

public class Question1_5 {
    // global input scanner
    public static Scanner input = new Scanner(System.in);

    // prompt for continue or stop executed question
    public static boolean askAgain() {
        System.out.println("Do you want to Execute this question again then press (y)");
        System.out.print("Otherwise Press0 (b) to go to the main menu)");
        char choice = input.next().toLowerCase().charAt(0);
        return choice == 'y';
    }

    // question 1
    public static void question1() {
        String ssn;
        do {
            System.out.println("\n===============================================================");
            System.out.println("             --->Executing Question - 1<-------             ");
            System.out.print("Enter a SSN: ");
            ssn = input.next();

            boolean isValid = true;

            if (ssn.length() != 11) {
                isValid = false;
            } else if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-') {
                isValid = false;
            } else {
                for (int i = 0; i < 11; i++) {
                    if (i == 3 || i == 6)
                        continue;
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
    public static void question2() {
        String regCode;
        do {
            System.out.println("\n===============================================================");
            System.out.println("             --->Executing Question - 2<-------             ");
            System.out.print("Enter two characters: ");
            regCode = input.next().toUpperCase();

            boolean isValid = true;

            if (regCode.length() != 2) {
                isValid = false;
            } else if (regCode.charAt(1) > '4' || regCode.charAt(1) < '1') {
                isValid = false;
            } else if (regCode.charAt(0) != 'M' && regCode.charAt(0) != 'C' && regCode.charAt(0) != 'I') {
                isValid = false;
            }

            if (isValid) {
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

    // question 3
    public static void question3() {
        do {
            System.out.println("\n===============================================================");
            System.out.println("             --->Executing Question - 3<-------             ");
            String plateNumber = "";

            for (int i = 0; i < 3; i++) {
                char letter = (char) ((int) (Math.random() * 26) + 'A');
                plateNumber += letter;
            }

            for (int i = 0; i < 4; i++) {
                int digit = (int) (Math.random() * 10);
                plateNumber += digit;
            }

            System.out.println("Generated Plate Number: " + plateNumber);

        } while (askAgain());
    }

    // question 4
    public static void question4() {
        do {
            System.out.println("\n===============================================================");
            System.out.println("             --->Executing Question - 4<-------             ");
            System.out.print("Enter a decimal number: ");

            if (input.hasNextInt()) {
                int decimal = input.nextInt();
                int tempDecimal = decimal;
                String binary = "";

                if (decimal == 0) {
                    binary = "0";
                } else if (decimal < 0) {
                    System.out.println("Please enter a positive number");
                    continue;
                } else {
                    while (tempDecimal > 0) {
                        int reminder = tempDecimal % 2;
                        binary = reminder + binary;
                        tempDecimal /= 2;
                    }
                }
                System.out.println("The Binary value of " + decimal + " is " + binary);
            } else {
                System.out.println("Invalid Input: The number is too large.");
                input.next();
            }

        } while (askAgain());
    }

    // question 5
    public static void question5() {
        do {
            System.out.println("\n===============================================================");
            System.out.println("             --->Executing Question - 5<-------             ");
            int score = 0;

            // mcq 1
            System.out.println("\n1. Most scientists believe global warming is primarily caused by:");
            System.out.println(
                    "1. Human activity (CO2 emissions)\n2. Volcanic eruptions\n3. Solar cycles\n4. Ocean currents");
            System.out.print("Your answer: ");
            if (input.nextInt() == 1)
                score++;

            // mcq 2
            System.out.println(
                    "\n2. Skeptics often point to which historical period to show natural climate variability?");
            System.out.println(
                    "1. The Industrial Revolution\n2. The Medieval Warm Period\n3. The Great Depression\n4. The Renaissance");
            System.out.print("Your answer: ");
            if (input.nextInt() == 2)
                score++;

            // mcq 3
            System.out.println("\n3. Which gas is considered the primary greenhouse gas emitted by humans?");
            System.out.println("1. Oxygen\n2. Helium\n3. Carbon Dioxide\n4. Argon");
            System.out.print("Your answer: ");
            if (input.nextInt() == 3)
                score++;

            // mcq 4
            System.out.println("\n4. Skeptics argue that sea level rise is:");
            System.out.println(
                    "1. Not happening at all\n2. Primarily due to underwater earthquakes\n3. A natural process occurring since the last ice age\n4. Caused by ship displacements");
            System.out.print("Your answer: ");
            if (input.nextInt() == 3)
                score++;

            // mcq 5
            System.out.println("\n5. What was the main goal of the Kyoto Protocol?");
            System.out.println(
                    "1. To ban all cars\n2. To reduce greenhouse gas emissions\n3. To explore Mars\n4. To promote coal mining");
            System.out.print("Your answer: ");
            if (input.nextInt() == 2)
                score++;

            // result
            System.out.println("\n---- Your Result ----");
            if (score == 5) {
                System.out.println("Excellent");
            } else if (score == 4) {
                System.out.println("Very good");
            } else {
                System.out.println("Time to brush up on your knowledge of global warming.");
                System.out.println("Check these websites for more info:");
                System.out.println("- NASA: climate.nasa.gov");
                System.out.println("- IPCC: ipcc.ch");
                System.out.println("- Climate Skeptics: petitionproject.org");
            }
        } while (askAgain());
    }

    // maiin method
    public static void main(String[] args) {
        int option;

        do {
            System.out.println("\n===============================================================");
            System.out.println("             --->Main Menu (Assignment-3)<-------              ");
            System.out.println("1. Question-1");
            System.out.println("2. Question-2");
            System.out.println("3. Question-3");
            System.out.println("4. Question-4");
            System.out.println("5. Question-5");
            System.out.println("Press option (1-5) to execute the program and Press 0 to Exit");
            System.out.print("Enter your option:");

            if (input.hasNextInt()) {
                option = input.nextInt();

                switch (option) {
                    case 1:
                        question1();
                        break;
                    case 2:
                        question2();
                        break;
                    case 3:
                        question3();
                        break;
                    case 4:
                        question4();
                        break;
                    case 5:
                        question5();
                        break;
                    case 0:
                        System.out.println("Exiting... Good Bye!");
                        break;
                    default:
                        System.out.println("Invalid option! Try again.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number (0-5).");
                input.next();
                option = -1;
            }

        } while (option != 0);

        input.close();
    }
}