import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter a string: ");
        String userString = input.nextLine();

        int letterCount = countLetters(userString);
        System.out.println("the number of letters in the string: " + letterCount);

        input.close();
    }

    // method that counts the number of letters in a string
    public static int countLetters(String s) {
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isLetter(currentChar)) {
                count++;
            }
        }
        
        return count;
    }
}