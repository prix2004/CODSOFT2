import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[6];
        float total = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter mark for subject " + (i + 1) + ":");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        float average = total / 6;
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 70) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("TOTAL : " + total);
        System.out.println("AVERAGE : " + average);
        System.out.println("GRADE : " + grade);

        sc.close();
    }
}
