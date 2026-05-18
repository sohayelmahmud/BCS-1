import java.io.*;
import java.util.*;

public class replaceText {
    public static void main(String[] args) throws Exception {
        // check command line parameter usage
        if (args.length != 4) {
            System.out.println("Usage: java replaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        // check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        // check if target file exists
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(3);
        }

        // create input and output files manually without try block
        Scanner input = new Scanner(sourceFile);
        PrintWriter output = new PrintWriter(targetFile);

        // loop through the file lines
        while (input.hasNext()) {
            String oldStr = input.nextLine();
            String newStr = oldStr.replaceAll(args[2], args[3]);
            output.println(newStr);
        }

        // close both files manually to save memory
        input.close();
        output.close();
    }
}