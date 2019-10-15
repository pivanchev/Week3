
package week3;
import java.util.Scanner;

public class ConvertTemperatures {
   
    public void Main (){
       
       
       
       
        System.out.println("Enter the temperature!");
       
        Scanner scan=new Scanner(System.in);
        double centigrade=scan.nextDouble();
        double fahrenheit=1.8*centigrade+32;
       
        System.out.println(centigrade + " degrees centigrade = " + fahrenheit + " degrees Fahrenheit");
       
       
    }
   
}
