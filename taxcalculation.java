package assignment_2;

import java.util.Scanner;

public class taxcalculation {
	public static void main(String args[]) {
		  double tax;
		  int n;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("enter your income:");
	      n=sc.nextInt();
	      if(n<150000) {
	      System.out.println("no tax");
	      }
	      else if(n<300001) {
	    	  tax=0.1* n;
		      System.out.println("Tax ="+tax);
		  }
	      else if(n<500000) {
	    	  tax=0.2* n;
		      System.out.println("Tax ="+tax);
		  }
	      else {
	    	  tax=0.3*n;
	    	  System.out.println("tax="+tax);
	      }
		}
}
