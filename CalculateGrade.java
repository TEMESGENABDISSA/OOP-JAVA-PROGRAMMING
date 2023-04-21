import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;

        System.out.print("Enter your score: ");
        score = scanner.nextInt();

        String grade;
        if (score < 40) {
            grade = "F";
        } else if (score >= 40 && score <= 50) {
            grade = "D";
        } else if (score >= 51 && score <= 65) {
            grade = "C";
        } else if (score >= 66 && score <= 75) {
            grade = "B";
        } else if (score >= 76 && score <= 85) {
            grade = "A";
        } else {
            grade = "A+";
        }

        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
}
