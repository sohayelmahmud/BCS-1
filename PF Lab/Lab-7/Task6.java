import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter a line of lowercase words: ");
        String line = input.nextLine();

        String[] words = line.split(" ");
        
        System.out.print("capitalized output: ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(capitalize(words[i]) + " ");
        }
        System.out.println();

        input.close();
    }

    // method that takes a lowercase word and returns it with the first letter capitalized
    public static String capitalize(String lowerCaseWord) {
        if (lowerCaseWord == null || lowerCaseWord.isEmpty()) {
            return lowerCaseWord;
        }
        
        char firstChar = Character.toUpperCase(lowerCaseWord.charAt(0));
        String restOfWord = lowerCaseWord.substring(1);
        
        return firstChar + restOfWord;
    }
}