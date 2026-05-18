import java.util.*;
import java.io.*;

public class Question3 {
    public static Scanner input = new Scanner(System.in);

    // search ranking
    public static int findRanking(File file, String gender, String name) throws IOException {
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {
            int rank = inputFile.nextInt();
            String boyName = inputFile.next();
            String girlName = inputFile.next();

            if (gender.equalsIgnoreCase("M")) {
                if (boyName.equalsIgnoreCase(name)) {
                    inputFile.close();
                    return rank;
                }
            } else {
                if (girlName.equalsIgnoreCase(name)) {
                    inputFile.close();
                    return rank;
                }
            }
        }
        inputFile.close();
        return -1;
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Enter the gender: ");
        String gender = input.nextLine();
        System.out.print("Enter the Name: ");
        String name = input.nextLine();

        String fileName = "babynameranking" + year + ".txt";
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("Year does not match the criteria. ");
            System.exit(1);
        }

        int rank = findRanking(file, gender, name);

        if (rank != -1) {
            System.out.println(name + " is ranked #" + rank + " in year " + year);
        } else {
            System.out.println("The name " + name + " is not ranked in year " + year);
        }

    }
}
