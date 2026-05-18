import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int totalStudents = input.nextInt();

        for (int i = 1; i <= totalStudents; i++) {
            input.nextLine();
            System.out.print("Enter name of student " + i + ": ");
            String studentName = input.nextLine();

            double totalMarks = 0;
            for (int j = 1; j <= 4; j++) {
                System.out.print("Enter marks for " + j + " subjects: ");
                double subjectMark = input.nextDouble();
                totalMarks += subjectMark;
            }

            double averageMarks = totalMarks / 4;

            System.out.println(studentName + ": Total Marks: " + (int) totalMarks + ", Average Marks: " + averageMarks);
        }

        input.close();
    }
}