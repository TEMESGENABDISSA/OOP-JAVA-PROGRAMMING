import java.util.Scanner;
public class CheckNumber{
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int num = in.nextInt();
       in .close();

       if (num > 0) {
           System.out.println("The number is positive.");
       } else if (num < 0) {
           System.out.println("The number is negative.");
       } else {
           System.out.println("The number is zero.");
       }
   }
}

       