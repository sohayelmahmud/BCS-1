import java.io.*;
import java.util.*;

public class exercise4 {
    public static void main(String[] args) throws IOException {
        File sourceFile = new File("exercise4.txt");
        if (!sourceFile.exists()) {
            System.out.println("exiting.........");
            System.exit(1);
        }

        Scanner input = new Scanner(sourceFile);

        double sum = 0, avg, counter = 0;
        while (input.hasNext()) {
            double num = input.nextDouble();
            sum += num;
            counter++;
        }
        input.close();

        avg = sum / counter;

        File targetFile = new File("exercise5.txt");
        PrintWriter output = new PrintWriter(targetFile);

        output.printf("Sum is %.2f\n", sum);
        output.printf("avg is %.2f\n", avg);

        output.close();
    }
}
