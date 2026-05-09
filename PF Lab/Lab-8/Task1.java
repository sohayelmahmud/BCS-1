public class Task1 {
    public static void main(String[] args) {
        int[] responses = {
                1, 2, 5, 4, 3, 5, 2, 1, 3, 3,
                1, 4, 3, 3, 3, 2, 3, 3, 2, 2,
                5, 7, 10, 8, 9, 7, 6, 8, 5, 4,
                10, 9, 8, 7, 5, 6, 4, 3, 2, 1
        };

        int[] count = new int[11];

        for (int answer : responses) {
            if (answer >= 1 && answer <= 10) {
                count[answer]++;
            }
        }

        System.out.println("Rating\tStudent Count");
        System.out.println("------\t-------------");

        for (int rating = 1; rating < count.length; rating++) {
            System.out.println(rating + "\t" + count[rating]);
        }
    }
}