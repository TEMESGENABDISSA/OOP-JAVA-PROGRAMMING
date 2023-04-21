
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Welcome to BMI Calculator!");
        System.out.print("Enter your weight (in kilograms): ");
        weight = scanner.nextDouble();

        System.out.print("Enter your height (in meters): ");
        height = scanner.nextDouble();

        bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18 && bmi <= 24) {
            System.out.println("You are of normal weight.");
        } else if (bmi >= 25 && bmi <= 30) {
            System.out.println("You are overweight.");
        } else if (bmi >= 35 && bmi <= 39) {
            System.out.println("You are obese.");
        } else {
            System.out.println("Your BMI is not within the provided range.");
        }

        scanner.close();
    }
}

