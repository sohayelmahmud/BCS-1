import java.util.Scanner;
import java.net.*;

public class readFileFromURL {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        String urlString = new Scanner(System.in).next();

        try {
            // using URI to avoid deprecation warning in modern java
            URL url = new URI(urlString).toURL();
            int count = 0;
            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }

            // close the scanner to release network resources
            input.close();

            System.out.println("The file size is " + count + " characters");
        } catch (URISyntaxException ex) {
            System.out.println("Invalid URL syntax");
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL protocol");
        } catch (java.io.IOException ex) {
            System.out.println("I/O Errors: no such file");
        }
    }
}