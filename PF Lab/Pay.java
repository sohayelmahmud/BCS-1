/*This is activity 3 of Programmminh Fundamentals lab

RECORD of THE RESULT
____________________________________________________________________
| Hourse  |  Rate  |  Pay(hand calculated)  |  Pay(program result)  |
|_________|________|________________________|_______________________|
|  30     |  30    |         900            |         900           |
|_________|________|________________________|_______________________|
|  70     |  70    |         5950           |        5950           |
|_________|________|________________________|_______________________|
|  100    |  30    |         3900           |        3900           |
|_________|________|________________________|_______________________|

*/

import java.util.Scanner;

public class Pay {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double hours, rate, pay;

        System.out.print("How many hourse did you work? ");
        hours = keyboard.nextDouble();
        System.out.print("How much do you get paid per houre? ");
        rate = keyboard.nextDouble();

        if (hours <= 40)
            pay = hours * rate;
        else
            pay = (hours - 40) * (1.5 * rate) + 40 * rate;

        System.out.println("You earned $" + pay);

    }
}
