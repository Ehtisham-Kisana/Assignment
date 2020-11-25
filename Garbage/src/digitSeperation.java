import java.util.Scanner;
public class digitSeperation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num,a,b,c,d,e;
		System.out.println("Enter num: " );
		num = input.nextInt();
		a=num%10;
		num=num/10;
		b=num%10;
		num=num/10;
		c=num%10;
		num=num/10;
		d=num%10;
		num=num/10;
		e=num;
		
		System.out.println( e+"   "+ d +"   "+ c +"   "+ b +"   " + a);	
	}

}
