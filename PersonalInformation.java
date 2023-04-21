import java.util.Scanner;
import java.util.zip.Inflater;
public class PersonalInformation{
    public static void main( String [] args){
        String name;
        int age;
        String occupation;

        Scanner in = new Scanner ( System.in);
        System.out.println(" enter your name");
        name= in.nextLine();
        System.out.println(" enter your age ");
        age = in. nextInt();
        System.out.println( " enter your occupation ");
        occupation = in.nextLine();
        System.out.println("Hello " );
        System.out.print (name );
        System.out.print(" you are" + age);
        System.out.print("years old,you are," + occupation);

    }
    
}
