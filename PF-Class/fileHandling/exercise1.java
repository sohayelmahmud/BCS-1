import java.io.*;

public class exercise1 {
    public static void main(String[] args) throws IOException {
        File file = new File("exercise1.txt");

        PrintWriter output = new PrintWriter(file);

        output.print("Jim ");
        output.println("90");
        output.print("Prince ");
        output.println("80");

        output.close();
    }
}
