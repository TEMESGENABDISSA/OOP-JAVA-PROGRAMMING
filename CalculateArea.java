import java.util.Scanner;
public class CalculateArea {
    public static void main( String [] args){
        int r ;
        double Area;
        double pi = 3.14;
        Scanner  in  = new Scanner (System.in);
        System.out.println(" Enter the radius of the circle");
        r = in.nextInt();
        Area = pi * ( r*r);
        System.out.println( "Area of the circle is  " + Area);


       }
}
