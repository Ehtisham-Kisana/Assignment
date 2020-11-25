import java.util.Scanner;

public class calculateGrossPay {

	public static void main(String[] args) {
		float shoes = 170.99f;
		float shorts = 62.40f;
	    float Tshirt = 83.50f;
	    int Sho, shrt, Tsht;
	    Scanner s = new Scanner(System.in);
	    System.out.println("Value of one shoes is : " + shoes );
	    System.out.println("No of shoes sold :");
	    Sho = s.nextInt();
	  
	    System.out.println("Value of one short is : " + shorts );
	    System.out.println("No of shorts sold :");
	    shrt = s.nextInt();
	    
	    
	    System.out.println("Value of one Tshirt is : " + Tshirt );
	    System.out.println("No of Tshirt sold :");
	    Tsht = s.nextInt();
	    
	    System.out.println("Your calculated weekly gross pay is : " + ((((((shoes*Sho)+(shorts*shrt)+(Tshirt*Tsht))*4.25)/100))+220) );
	}

}
