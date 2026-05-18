import java.util.Scanner;

public class readData {
    public static void main(String[] args) throws Exception {
        // create a file instance
        java.io.File file = new java.io.File("scores.txt");

        // create a scanner for the file
        Scanner input = new Scanner(file);

        // read data from a file
        while (input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(
                    firstName + " " + mi + " " + lastName + " " + score);
        }

        // close the file
        input.close();
    }
}