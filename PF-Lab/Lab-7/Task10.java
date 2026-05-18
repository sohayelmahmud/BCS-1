import java.util.Scanner;

public class Task10 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int option;

        do {
            System.out.println("\n===============================================================");
            System.out.println("             --->main menu (assignment-4)<-------              ");
            System.out.println("1. question-1");
            System.out.println("2. question-2");
            System.out.println("3. question-3");
            System.out.println("4. question-4");
            System.out.println("press option (1-4) to execute the program and press 0 to exit");
            System.out.print("enter your option: ");

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
                    case 0:
                        System.out.println("exiting... good bye!");
                        break;
                    default:
                        System.out.println("invalid option! try again.");
                }
            } else {
                System.out.println("invalid input! please enter a number (0-4).");
                input.next();
                option = -1;
            }

        } while (option != 0);

        input.close();
    }

    // prompt for continue or stop executed question
    public static boolean askAgain() {
        System.out.println("do you want to execute this question again then press (y)");
        System.out.print("otherwise press (b) to go to the main menu: ");
        char choice = input.next().toLowerCase().charAt(0);
        return choice == 'y';
    }

    // method to execute question 1 (star pattern)
    public static void question1() {
        do {
            System.out.println("\n===============================================================");
            System.out.println("             --->executing question - 1<-------             ");
            System.out.print("enter number of rows for pattern: ");
            int patternRows = input.nextInt();
            printPattern(patternRows);
        } while (askAgain());
    }

    // method to execute question 2 (reverse sequence)
    public static void question2() {
        do {
            System.out.println("\n===============================================================");
            System.out.println("             --->executing question - 2<-------             ");
            System.out.print("enter an integer sequence to reverse: ");
            int userSequence = input.nextInt();
            System.out.print("reversed sequence: ");
            reverseSequence(userSequence);
            System.out.println();
        } while (askAgain());
    }

    // method to execute question 3 (decimal to binary)
    public static void question3() {
        do {
            System.out.println("\n===============================================================");
            System.out.println("             --->executing question - 3<-------             ");
            System.out.print("enter an integer to convert to binary: ");
            int decimalNum = input.nextInt();
            System.out.print("binary equivalent: ");
            if (decimalNum == 0) {
                System.out.print(0);
            } else {
                convertToBinary(decimalNum);
            }
            System.out.println();
        } while (askAgain());
    }

    // method to execute question 4 (binary search)
    public static void question4() {
        do {
            System.out.println("\n===============================================================");
            System.out.println("             --->executing question - 4<-------             ");
            int[] sortedArray = {11, 22, 33, 44, 55, 66, 77};
            System.out.print("enter key to search in ");
            printArray(sortedArray);
            System.out.print(": ");
            int searchKey = input.nextInt();
            
            int searchResult = binarySearch(sortedArray, searchKey, 0, sortedArray.length - 1);
            if (searchResult != -1) {
                System.out.println("element found at index: " + searchResult);
            } else {
                System.out.println("element not found.");
            }
        } while (askAgain());
    }

    // method to print elements of an array
    public static void printArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }

    // method to print a left aligned triangle pattern using recursion
    public static void printPattern(int n) {
        if (n <= 0) {
            return;
        }
        
        System.out.println("\n--- pattern 1 (centered triangle) ---");
        patternOne(n, n);

        System.out.println("\n--- pattern 2 (right aligned triangle) ---");
        patternTwo(n, n);

        System.out.println("\n--- pattern 3 (left aligned triangle) ---");
        patternThree(n);

        System.out.println("\n--- pattern 4 (inverted left aligned triangle) ---");
        patternFour(n);
    }

    // helper method to print spaces using recursion
    public static void printSpaces(int spaces) {
        if (spaces == 0) {
            return;
        }
        System.out.print("  "); // two spaces to match the "* " format
        printSpaces(spaces - 1);
    }

    // method for pattern 1: centered triangle (fixed space alignment)
    public static void patternOne(int n, int totalRows) {
        if (n == 0) {
            return;
        }
        patternOne(n - 1, totalRows);
        printSingleSpaces(totalRows - n);
        printStars(n);
        System.out.println();
    }

    // helper method to print a single space for center alignment
    public static void printSingleSpaces(int spaces) {
        if (spaces == 0) {
            return;
        }
        System.out.print(" "); // single space to correctly center the "* " format
        printSingleSpaces(spaces - 1);
    }

    // method for pattern 2: right aligned triangle
    public static void patternTwo(int n, int totalRows) {
        if (n == 0) {
            return;
        }
        patternTwo(n - 1, totalRows);
        printSpaces(totalRows - n);
        printStarsRight(n);
        System.out.println();
    }

    // helper for pattern 2 to align stars tightly to the right boundary
    public static void printStarsRight(int stars) {
        if (stars == 0) {
            return;
        }
        System.out.print(" *");
        printStarsRight(stars - 1);
    }

    // method for pattern 3: left aligned triangle (your original logic)
    public static void patternThree(int n) {
        if (n == 0) {
            return;
        }
        patternThree(n - 1);
        printStars(n);
        System.out.println();
    }

    // method for pattern 4: inverted left aligned triangle
    public static void patternFour(int n) {
        if (n == 0) {
            return;
        }
        printStars(n);
        System.out.println();
        patternFour(n - 1);
    }

    // helper method to print stars in a single row using recursion
    public static void printStars(int stars) {
        if (stars == 0) {
            return;
        }
        System.out.print("* ");
        printStars(stars - 1);
    }

    // method to print a sequence of integers in reverse order using recursion
    public static void reverseSequence(int number) {
        if (number == 0) {
            return;
        }
        System.out.print(number % 10);
        reverseSequence(number / 10);
    }

    // method to convert a decimal integer into its binary equivalent using recursion
    public static void convertToBinary(int number) {
        if (number == 0) {
            return;
        }
        convertToBinary(number / 2);
        System.out.print(number % 2);
    }

    // method to implement the binary search algorithm using recursion
    public static int binarySearch(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return binarySearch(arr, key, low, mid - 1);
        } else {
            return binarySearch(arr, key, mid + 1, high);
        }
    }
}