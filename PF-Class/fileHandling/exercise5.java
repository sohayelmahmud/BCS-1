import java.io.*;

public class exercise5 {
    public static void main(String[] args) throws IOException {
        File file = new File("exercise4.txt");

        PrintWriter output = new PrintWriter(file);

        for (int i = 0; i < 100; i++) {
            output.print((int) (Math.random() * 100) + " ");
        }
        output.close();
    }
}
