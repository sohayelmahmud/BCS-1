import java.util.*;

public class Activity3 {
    static Scanner console = new Scanner(System.in); 
    public static void main(String [] args){ 
        String firstName;  
        String lastName;  
        int age;  
        double weight;  
        System.out.println("Enter first name, last name, " + "age, and weight separated " + "by spaces.");  
        firstName = console.next();  
        lastName = console.next(); 
        age = console.nextInt(); 
        weight = console.nextDouble(); 
        System.out.print("Name: " + firstName + " " + lastName); 
        System.out.print(" Age: " + age); 
        System.out.print(" Weight: " + weight); 
    }
}
