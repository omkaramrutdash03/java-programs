package assignment_3;

import java.util.Scanner;

class rectanglee{
	Float ar,r ;
	void area() {
		float a,b,c,d;
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter the sides of rectangle 1:");
	    a=sc.nextFloat();
	    b=sc.nextFloat();
	    System.out.println("enter the sides of rectangle 2:");
	    c=sc.nextFloat();
	    d=sc.nextFloat();
	    ar=a*b;
	    System.out.println("Area of rectangle 1 is : "+ ar);
	    r=c*d;
	    System.out.println("Area of rectangle 2 is : "+ r);
	}
}
public class arearect {
	public static void main(String args[]) {
		rectanglee r=new rectanglee();
	    r.area();
	}
}
