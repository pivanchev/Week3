
package week3;
import java.util.Scanner;

public class MilesPerGallon {
    public  void Main (){
       
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the milage!");
        double milage=scan.nextDouble();
        System.out.println("Enter the gallons!");
        double gallons=scan.nextDouble();
        double mpg=milage/gallons;
       
        System.out.println("Miles per gallon " + mpg);
       
       
       
    }
   
}
