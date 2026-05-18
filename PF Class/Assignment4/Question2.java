import java.io.*;
import java.util.*;

public class Question2 {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("file does not exist....");
            System.exit(1);
        }
        Scanner input = new Scanner(file);

        int wordCount = 0, charCount = 0, lineCount = 0;
        while (input.hasNext()) {
            String word = input.next();
            wordCount++;
            charCount += word.length();
        }
        input.close();

        Scanner lineInput = new Scanner(file);
        while (lineInput.hasNextLine()) {
            lineInput.nextLine();
            lineCount++;
        }
        lineInput.close();

        System.out.println("This txt file has " + charCount + " characters");
        System.out.println("This txt file has " + wordCount + " words.");
        System.out.println("This txt file has " + lineCount + " lines.");
    }
}
