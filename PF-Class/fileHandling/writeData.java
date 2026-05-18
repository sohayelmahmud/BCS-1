public class writeData {
    public static void main(String[] args) throws java.io.IOException {
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        // create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // write formatted output to the file
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);

        // close the file
        output.close();
    }
}