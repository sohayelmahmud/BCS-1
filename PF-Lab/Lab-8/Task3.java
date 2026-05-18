public class Task3 {
    // funtion for print array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // funtion for revers the array
    public static int[] reverseArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - 1 - i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Original array elements: ");
        printArray(array);

        int[] reversedArray = reverseArray(array);

        System.out.println("Reversed array elemnets: ");
        printArray(reversedArray);
    }
}
