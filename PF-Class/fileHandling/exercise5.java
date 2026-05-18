import java.io.*;
import java.util.*;

public class exercise5 {
    public static void main(String[] args) throws IOException {
        File sourceFile = new File("exercise4.txt");

        PrintWriter output = new PrintWriter(sourceFile);

        for (int i = 0; i < 100; i++) {
            output.print((int) (Math.random() * 100) + " ");
        }
        output.close();

        Scanner input = new Scanner(sourceFile);

        int[] numbers = new int[100];
        int index = 0;

        while (input.hasNext()) {
            numbers[index] = input.nextInt();
            index++;
        }
        input.close();

        // Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // File targetFile = new File("exercise6.txt");
        // PrintWriter output2 = new PrintWriter(targetFile);
        for (int num : numbers) {
            // output2.print(num + " ");
            System.out.print(num + " ");
        }
        // output2.close();
    }
}
