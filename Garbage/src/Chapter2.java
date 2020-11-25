/* Write an application that asks the user to enter two integers, obtains them
   from the user and prints their sum, product, difference and quotient (division).*/ 
import java.util.Scanner;

public class Chapter2 {

	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
		float a,b,sum,product, subtract;
		float divivision;
		System.out.print("Enter a  : ");
		a=reader.nextInt();
		System.out.print("Enter b  : ");
		b=reader.nextInt();
		sum = a+b;
	    product = a*b;
	    divivision = a/b;
	    subtract = a-b;
		System.out.print("\nEnter Multiply : " + product);
		
		System.out.print("\nEnter Add  : " + sum);
		
		System.out.print("\nEnter Difference  : " + subtract);
		
		System.out.print("\nEnter Division  : " + divivision);

		System.out.print(" \n");
		if(a>b) {
			System.out.print(a + " is larger than " + b);
		}
		else if (b>a) {
			System.out.print(b + " is larger than " + a);
		}

		else if (b==a) {
			System.out.print(a + " and " + b + " are equal ");
		}
		
		
	}

}
