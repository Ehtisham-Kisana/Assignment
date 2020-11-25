
import java.util.Scanner;
public class comparison {
public static void maibn(String[] args) {
    Scanner input = new Scanner(System.in);
	int a,b,c,d,e;
    System.out.print("Enter a: " );
    a=input.nextInt();
    if(a>=0) {
  	  System.out.print("a is positive\n" );
  	}
  else if(a==0) {
  	  System.out.print("a is zero\n" );
  }
  	  else if(a<0) {
  		  System.out.print("a is negative\n" );
  	  }
    
    System.out.print("\nEnter b: " );
    b=input.nextInt();
    if(b>=0) {
  	  System.out.print("b is positive\n" );
  	}
  else if(b==0) {
  	  System.out.print("b is zero\n" );
  }
  	  else if(b<0) {
  		  System.out.print("b is negative\n" );
  	  }
    System.out.print("\nEnter c: " );
    c=input.nextInt();
    if(c>=0) {
  	  System.out.print("c is positive\n" );
  	}
  else if(c==0) {
  	  System.out.print("c is zero\n" );
  }
  	  else if(c<0) {
  		  System.out.print("c is negative\n" );
  	  }
    System.out.print("\nEnter d: " );
    d=input.nextInt();    
    if(d>=0) {
  	  System.out.print("d is positive\n" );
  	}
  else if(d==0) {
  	  System.out.print("d is zero\n" );
  }
  	  else if(d<0) {
  		  System.out.print("d is negative\n" );
  	  }
    System.out.print("\nEnter e: " );
    e=input.nextInt();
    if(e>=0) {
  	  System.out.print("e is positive\n" );
  	}
  else if(e==0) {
  	  System.out.print("e is zero\n" );
  }
  	  else if(e<0) {
  		  System.out.print("e is negative\n" );
  	  }

}
}