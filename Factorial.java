import java.util.Scanner;
public class Factorial {
    public static void main( String [] args){
             int n, i, fact=1;

             System.out.println(" enter an integer number to calculate its factorial");
             Scanner in = new Scanner ( System.in);
             n = in.nextInt();
             if ( n<0)
             System.out.println(" the number is negative");
             else{
                for ( i=1;i<=n;i++)
                fact = fact*i;
                System.out.println("factorial of the  "+ n+ "is " +fact);
             }

    }
    
}
