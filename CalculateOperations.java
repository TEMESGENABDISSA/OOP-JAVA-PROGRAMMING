import java .util.Scanner;
public class CalculateOperations {
    public  static void main ( String [] args){
        int num1,num2,sum,pro,diff,quo;
        Scanner in = new Scanner (System.in);
        System.out.println(" enter the first number" );
        num1 = in.nextInt();
        System.out.println(" enter the  second number");
        num2 = in.nextInt();
        sum=num1 +num2;
        pro= num1*num2;
        diff = num1 - num2;
        diff = num2-num1;
        quo = num1 / num2;
        quo = num2 /num1;
        System.out.println( " the sum is " + sum);
        System.out.println(" the product is " + pro);
        System.out.println( " the difference " + diff);
        System.out.println( " the quotient is " + quo);
        
    }

}
