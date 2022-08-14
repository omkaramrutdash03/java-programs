package assignment_2;
import java.util.*;
public class factorial {
	public static void main(String args[]) {
		  int n,i,f=1;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("enter a number:");
	      n=sc.nextInt();
	      for(i=n;i>0;i--) {
	    	  f=f*i;
	      }
	      System.out.println("Factorial of :"+n +" is "+f);
	}
}
