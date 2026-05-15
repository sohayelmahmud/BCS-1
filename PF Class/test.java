import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = input.nextInt();
        System.out.print("Enter column: ");
        int column = input.nextInt();
        int[][] myList = new int[row][column];
        // random value
        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++){
                myList[i][j] = (int)(Math.random()*100);
            }
        }
        // sum
        int total=0;
        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++){
                total += myList[i][j];
            }
        }
        // print main matrix
        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++){
                System.out.print(myList[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println("sum: " + total);
        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++){
                int i1 = (int)(Math.random()*i);
                int j1 = (int)(Math.random()*j);

                int temp = myList[i][j];
                myList[i][j] = myList[i1][j1];
                myList[i1][j1] = temp;
            }
        }
        // print random indexed matrix
        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++){
                System.out.print(myList[i][j] + "    ");
            }
            System.out.println();
        }
    }
}