public class Task4 {
    public static void main(String[] args) {
        for (int currentYear = 2000; currentYear <= 2020; currentYear++) {
            int days = numberOfDaysInAYear(currentYear);
            System.out.println(currentYear + " has " + days + " days.");
        }
    }

    // method to return the number of days in a year
    public static int numberOfDaysInAYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return 366;
        } else {
            return 365;
        }
    }
}