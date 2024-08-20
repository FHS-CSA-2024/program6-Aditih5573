//import stuff here!

//Your code here

//Paste console output below:
/*
set pi as final variable

*/
import java.util.Scanner;

public class circleComponents {
    public static void main(String[] args) {
 final double PI = 3.14159;       
 Scanner radius = new Scanner(System.in);
 System.out.println("Enter the radius: ");
 double rad = radius.nextDouble();
 double diameter = 2 * rad;
 double area = (PI) * rad * rad;
 double circum = 2 * PI * rad;
 
 System.out.println("The radius of the circle = " + rad);
 System.out.println("The diameter of the circle = " + diameter);
 System.out.println("The area of the circle = " + area);
 System.out.println("The circumference of the circle = " + circum);
 
 
        
    }
}
