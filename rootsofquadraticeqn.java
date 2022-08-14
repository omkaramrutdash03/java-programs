package assignment_2;
import java.util.*;
public class rootsofquadraticeqn {
	public static void main(String args[]) {
		  float a,b,c,d;
		double r1,r2,i,r;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("enter the coefficient of x2");
	      a=sc.nextFloat();
	      System.out.println("enter the coefficient of x:");
	      b=sc.nextFloat();
	      System.out.println("enter the constant:");
	      c=sc.nextFloat();
	      d=b*b-4*a*c;
	      if(a==0 && b==0) {
	    	  System.out.println("the roots are undefined");
	      }
	      else if(a==0)	{
	    	  r1=-c/b;
	    	  System.out.println("the root is linear "+r1);
	      }
	      else if(a>0)	{
	    	  r1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
	    	  r2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
	    	  System.out.println("the roots are real "+r1+" and "+r2);
	      }
	      else if(d==0) {
	    	  r1=r2=-b/(2*a);
	    	  System.out.println("the roots are equal  "+r1+" and "+r2);
	      }
	      else {
	    	  r=-b/(2*a);
	    	  i=Math.sqrt(-d)/(2*a);
	    	  System.out.println("the roots are "+r+"+"+i+"i and "+ r+"-"+i+"i");
	      }
	}
}
