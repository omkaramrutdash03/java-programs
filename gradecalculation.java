package assignment_2;
import java.util.*;
public class gradecalculation {
	public static void main(String args[]) {
		  float a,b,c,d,avg;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("enter the first subject mark:");
	      a=sc.nextFloat();
	      System.out.println("enter the second subject mark:");
	      b=sc.nextFloat();
	      System.out.println("enter the third subject mark:");
	      c=sc.nextFloat();
	      System.out.println("enter the fourth subject mark:");
	      d=sc.nextFloat();
	      avg=(a+b+c+d)/4;
	      System.out.println("Average marks = "+avg);
	      if(avg>=90) {
	         System.out.println("O grade");
	      }
	      else if(avg>=80) {
		         System.out.println("E grade");
		  }
	      else if(avg>=70) {
		         System.out.println("A grade");
		  }
	      else if(avg>=60) {
		         System.out.println("B grade");
		  }
	      else if(avg>=50) {
		         System.out.println("C grade");
		  }
	      else {
		         System.out.println("F grade");
		  }
		}
}
