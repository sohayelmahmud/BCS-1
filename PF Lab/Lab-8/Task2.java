public class Task2 {
    // function to multiply each element by 3
    public static void modify(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 3;
        }
    }

    // function to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Original array elements:");
        printArray(numbers);

        modify(numbers);

        System.out.println("\nModified array elements (multiplied by 3):");
        printArray(numbers);
    }

}