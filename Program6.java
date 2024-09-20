//import stuff here!

//Your code here

//Paste console output below:
/*
set pi as final variable

*/
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
 final double PI = 3.14159;       
 Scanner radius = new Scanner(System.in);
 System.out.println("Enter the radius: ");
 double rad = radius.nextDouble();
 double diameter = 2 * rad;
 double area = (PI) * rad * rad;
 double circum = 2 * PI * rad;
 
 double roundDiameter = Math.round(diameter * 1000.0)/1000.0;
 double roundArea = Math.round(area * 1000.0)/1000.0;
 double roundCircum = Math.round(circum * 1000.0)/1000.0;
 
 
 System.out.println("The radius of the circle = " + rad);
 System.out.println("The diameter of the circle = " + roundDiameter);
 System.out.println("The area of the circle = " + roundArea);
 System.out.println("The circumference of the circle = " + roundCircum);
 
 
        
    }
}

//output
//Enter the radius: 
/*3.712
The radius of the circle = 3.712
The diameter of the circle = 7.424
The area of the circle = 43.288
The circumference of the circle = 23.323*/
