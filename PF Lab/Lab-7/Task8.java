import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter a string: ");
        String userString = input.nextLine();

        int vowelCount = countVowels(userString);
        System.out.println("number of vowels in the string: " + vowelCount);

        input.close();
    }

    // method to count all vowels in a string
    public static int countVowels(String s) {
        int count = 0;
        String lowerCaseStr = s.toLowerCase();

        for (int i = 0; i < lowerCaseStr.length(); i++) {
            char currentChar = lowerCaseStr.charAt(i);
            
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                count++;
            }
        }

        return count;
    }
}