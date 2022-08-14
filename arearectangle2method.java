package assignment_3;

import java.util.Scanner;

class Area{
	float a,b;
	void setDim() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter the sides of rectangle:");
	    a=sc.nextFloat();
	    b=sc.nextFloat();
	}
	void getArea() {
		Float ar;
		 ar=a*b;
		 System.out.println("Area of rectangle  is : "+ ar);
	}
}
public class arearectangle2method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Area A=new Area();
        A.setDim();
        A.getArea();
	}
}
