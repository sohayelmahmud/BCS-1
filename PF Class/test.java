public class test {
    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 4, 5};
        int n = myList.length;

        int temp = myList[0];

        for (int i = 0; i < n - 1; i++) {
            myList[i] = myList[i + 1];
        }

        myList[n - 1] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(myList[i] + " ");
        }
    }
}