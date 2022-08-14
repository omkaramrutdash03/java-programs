package assignment_2;
import java.util.*;
public class palindrome {
	public static void main(String args[]) {
		  int n,rev=0,i,r;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("enter a number:");
	      n=sc.nextInt();
	      i=n;
	      while(n>0) {
	    	  r=n%10;
	    	  rev=rev*10+r;
	    	  n=n/10;
	      }
	      if(i==rev) {
	    	  System.out.println(i+" is palindrome ");
	      }
	      else {
	    	  System.out.println(i+" is not palindrome ");
	      }
	      
	}
}
