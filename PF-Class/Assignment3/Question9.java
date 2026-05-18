import java.util.Scanner;

public class Question9 {
    public static Scanner input = new Scanner(System.in);

    public static void count(int[] arr, int x) {
        int c = 0;
        for (int val : arr)
            if (val == x)
                c++;
        System.out.println("Occurrence of " + x + " is: " + c);
    }

    public static int[] partition(int[] arr) {
        int pivot = arr[0];
        int[] result = new int[arr.length];
        int left = 0, right = arr.length - 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < pivot)
                result[left++] = arr[i];
            else
                result[right--] = arr[i];
        }
        result[left] = pivot;
        return result;
    }

    public static void duplicates(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i])
                continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " appears " + count + " times");
        }
    }

    public static void circular(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + 1) % n] + arr[(i + 2) % n];
        }
        System.arraycopy(temp, 0, arr, 0, n);
    }

    public static void shiftCircular(int[] arr) {
        int n = arr.length;
        if (n < 2)
            return;
        int first = arr[0], second = arr[1];
        for (int i = 0; i < n - 2; i++) {
            arr[i] = arr[i + 2];
        }
        arr[n - 2] = first;
        arr[n - 1] = second;
    }

    public static void printArray(int[] arr) {
        for (int val : arr)
            System.out.print(val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("\n=====================================");
        System.out.print("Enter array size: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();

        int choice;
        do {
            System.out.println("\n=====================================");
            System.out.println("--- MENU ---");
            System.out.println(
                    "1. Count Occurrences\n2. Partition\n3. Calculate Frequencies\n4. Circular Sum\n5. Shift Circular Left (2 positions)\n6. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to count: ");
                    int x = input.nextInt();
                    count(arr, x);
                    break;
                case 2:
                    arr = partition(arr);
                    printArray(arr);
                    break;
                case 3:
                    duplicates(arr);
                    break;
                case 4:
                    circular(arr);
                    printArray(arr);
                    break;
                case 5:
                    shiftCircular(arr);
                    printArray(arr);
                    break;
            }
        } while (choice != 6);
    }
}