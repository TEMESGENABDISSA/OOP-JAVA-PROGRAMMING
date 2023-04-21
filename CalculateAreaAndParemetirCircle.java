import java.util.Scanner;
public class CalculateAreaAndParemetirCircle {
    public static void main( String [ ] args){
        double PI= 3.14;
        double Area = 0;
        int r;
        double perimeter = 0;
        Scanner in = new Scanner ( System.in);
        System.out.println( " enter radius");
        r= in.nextInt();
        Area= PI * ( r*r);
        perimeter= 2* PI*r;
        System.out.println( " area of the circle is " + Area);
        System.out.println( " the perimeter of the circle is " + perimeter);
        

    }
}