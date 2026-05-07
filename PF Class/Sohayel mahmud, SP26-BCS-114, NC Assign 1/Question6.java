import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cnic;

        while (true) {
            System.out.print("Enter CNIC (xxxxx-xxxxxxx-x): ");
            cnic = input.next();
            if (cnic.length() == 15) {
                if (cnic.charAt(5) == '-' && cnic.charAt(13) == '-') {
                    boolean allDigits = true;
                    for (int i = 0; i < 15; i++) {
                        if (i == 5 || i == 13) continue;

                        char c = cnic.charAt(i);
                        if (c < '0' || c > '9') {
                            allDigits = false;
                            System.out.println("The CNIC Number should contain only (-) & (0-9)");
                            break;
                        }
                    }
                    if (allDigits) {
                        System.out.println("Valid CNIC format.");
                        break; 
                    }
                } else {
                    System.out.println("The CNIC Number should contain (-) after 5th & 13th digit.");
                }
            } else {
                System.out.println("The CNIC Number is should be 15 digits.");
            }
            System.out.println("Invalid format. Try again.");
        }
        input.close();
    }
}