import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstMax=0, secondMax=0, thirdMax=0, currentNumber=1;

        System.out.println("Enter numbers (Enter 0 to stop):");

        while (currentNumber!=0) {
            currentNumber = input.nextInt();
            if (currentNumber == 0)
                break;

            if (currentNumber > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = currentNumber;
            } else if (currentNumber > secondMax && currentNumber != firstMax) {
                thirdMax = secondMax;
                secondMax = currentNumber;
            } else if (currentNumber > thirdMax && currentNumber != secondMax && currentNumber != firstMax) {
                thirdMax = currentNumber;
            }
        }

        System.out.print("Three highest Numbers: " + firstMax + " > " + secondMax + " > " + thirdMax);
        System.out.println();

        input.close();
    }
}