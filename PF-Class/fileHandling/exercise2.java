import java.io.*;
import java.util.*;

public class exercise2 {
    public static void main(String[] args) throws IOException {
        File file = new File("exercise2.txt");
        if (!file.exists()) {
            System.out.println("file doesn't exist. ");
            System.exit(1);
        }

        Scanner input = new Scanner(file);
        StringBuilder buffer = new StringBuilder();
        while (input.hasNext()) {
            buffer.append(input.nextLine()).append("\n");
        }
        input.close();

        String content = buffer.toString();
        content = content.replaceAll("\\s*\\n\\s*\\{", " {");

        PrintWriter output = new PrintWriter(file);
        output.print(content);
        output.close();
    }
}
