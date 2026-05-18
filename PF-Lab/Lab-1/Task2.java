import java.util.*; 
public class Task2 { 
    public static void main(String[] args) {
        int area; 
        int perimeter; 
        int width; 
        int length; 
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the length: "); 
        length = console.nextInt(); 
        System.out.println(); 
        System.out.print("Enter the width: "); 
        width = console.nextInt(); 
        System.out.println(); 
        area = length * width; 
        perimeter = 2 * (length + width); 
        System.out.println("Area = " + area); 
        System.out.println("Perimeter = " + perimeter); 
    }
}