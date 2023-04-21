import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        int sum;
        double average;
        System.out.print("Enter first integer: ");
        num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        num2 = scanner.nextInt();

        System.out.print("Enter third integer: ");
        num3 = scanner.nextInt();

        System.out.print("Enter fourth integer: ");
        num4 = scanner.nextInt();

        System.out.print("Enter fifth integer: ");
        num5 = scanner.nextInt();
        sum = num1 + num2 + num3 + num4 + num5;
        average = (double) sum / 5;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}

