package assignment_2;
import java.util.*;
public class checknumber {
	public static void main(String args[]) {
		  int n;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("enter a number:");
	      n=sc.nextInt();
	      if(n>0) {
	      System.out.println(n+" is posetive");
	      }
	      else if(n==0) {
		      System.out.println(n+" is zero");
		  }
	      else {
	    	  System.out.println(n+" is negative");
	      }
		}
}
