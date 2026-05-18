import java.io.*;

public class Question1 {
    public static void main(String[] args) throws IOException {
        File file = new File("Text_IO.txt");
        if (file.exists()) {
            System.out.println("file already exists. appending new data...");
        } else {
            System.out.println("file does not exist. creating a new file...");
        }

        FileWriter filewriter = new FileWriter(file, true);
        PrintWriter output = new PrintWriter(filewriter);

        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 100);
            output.print(num + " ");
        }

        output.println();

        output.close();
        filewriter.close();
    }
}