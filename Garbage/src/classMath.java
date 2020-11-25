//*(Diameter, Circumference and Area of a Circle)Write an application that inputs from the user the radius of a circle
//as an integer and prints the circle’s diameter, circumference and area using the floating-point value
//3.14159 for π. Use the techniques shown in Fig. 2.7. [Note: You may also use the predefined constant Math.PI for the value of π. This constant is more precise than the value 3.14159. Class Math
//is defined in package java.lang. Classes in that package are imported automatically, so you do not
//need to import class Math to use it.] Use the following formulas (r is the radius):*/

import java.util.Scanner;

public class classMath {

public static void main(String[] args) {
			    Scanner reader = new Scanner(System.in);
					int radius;
					float pie;
					float diameter,circumference,area;
					
			    System.out.print("Radius is : " );
			    radius=reader.nextInt();
			    
			    System.out.print("Enter pie ");
                pie=reader.nextFloat();
               
             diameter= 2*radius;
             circumference= 2*pie*radius;
             area=  pie*radius*radius;
			    System.out.print("Area is: " + area);
			    System.out.print("\nCircumference is: " + circumference);
			    System.out.print("\nDiameter is:" + diameter);
				}
}
