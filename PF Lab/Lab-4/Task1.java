public class Task1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int z = 20;

        boolean result1 = !(x > 10);
        System.out.println("!(x > 10): " + result1);

        boolean result2 = x <= 5 || y < 15;
        System.out.println("x <= 5 || y < 15: " + result2);

        boolean result3 = (x != 5) && (y != z);
        System.out.println("(x != 5) && (y != z): " + result3);

        boolean result4 = x >= z || (x + y >= z);
        System.out.println("x >= z || (x + y >= z): " + result4);

        boolean result5 = (x <= y - 2) && (y >= z) || (z - 2 != 20);
        System.out.println("(x <= y - 2) && (y >= z) || (z - 2 != 20): " + result5);
    }
}