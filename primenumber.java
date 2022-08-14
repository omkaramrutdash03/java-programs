package assignment_2;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,count=0,i;
	     Scanner sc = new Scanner(System.in);
	     System.out.println("enter a number:");
	     n=sc.nextInt();
	     for(i=1;i<=n;i++)
	     {
	    	 if(n%i==0) {
	    		 count++;
	    	 }
	     }
	     if(count==2) {
	    	  System.out.println(n+" is prime");
	      }
	      else {
	    	  System.out.println(n+" is composite ");
	      }
	      
	}

}
