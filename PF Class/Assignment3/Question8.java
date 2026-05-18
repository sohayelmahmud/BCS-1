public class Question8 {
    public static void main(String[] args) {
        char[] myArray = {
                'a', 'c', 'b', 'a', 'a', 'b', 'c', 'c', 'a', 'b',
                'c', 'a', 'b', 'c', 'b', 'a', 'c', 'a', 'b', 'b',
                'a', 'c', 'c', 'a', 'b', 'a', 'c', 'b', 'a', 'c',
                'a', 'b', 'b', 'c', 'a', 'c', 'b', 'a', 'c', 'a',
                'b', 'c', 'a', 'b', 'c', 'a', 'b', 'c', 'a', 'b'
        };
        int countA = 0, countB = 0, countC = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 'a') {
                countA++;
            } else if (myArray[i] == 'b') {
                countB++;
            } else if (myArray[i] == 'c') {
                countC++;
            }
        }
        char[] sortedArray = new char[myArray.length];
        int index = 0;
        for (int j = 0; j < countA; j++) {
            sortedArray[index++] = 'a';
        }
        for (int j = 0; j < countB; j++) {
            sortedArray[index++] = 'b';
        }
        for (int j = 0; j < countC; j++) {
            sortedArray[index++] = 'c';
        }

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
    }
}
