import java.util.Scanner;
public class p3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double avg1, avg2, cost1, cost2;
        int t_page1, t_page2;
        System.out.print("enter total page for 1: ");
        t_page1 = input.nextInt();
        System.out.print("input 1st cost: ");
        cost1=input.nextDouble();
        System.out.print("enter total page for 2: ");
        t_page2 = input.nextInt();
        System.out.print("input 2nd cost: ");
        cost2=input.nextDouble();

        avg1 = cost1/t_page1;
        avg2=cost2/t_page2;

        if(avg1<avg2){
            System.out.printf("shop 1 cheaper and it costs %.2f per page.\n", avg1);
        }
        else if(avg1>avg2){
            System.out.printf("shop 2 cheaper and it costs %.2f per page.\n",avg2);
        }
        else{
            System.out.printf("both are same and it costs %.2f per page.\n",avg1);
        }
        input.close();
    }
}
