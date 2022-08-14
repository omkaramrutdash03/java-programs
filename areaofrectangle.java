package assignment_3;
class rectangle{
	float a,b,ar;
	void area() {
	    ar=a*b;
	    System.out.println(ar);
	}
}
public class areaofrectangle {
	public static void main(String args[]) {
		rectangle r=new rectangle();
		r.a=4;
		r.b=5;
		rectangle p=new rectangle();
		p.a=5;
		p.b=8;
		System.out.print("Area of rectangle 1 is : ");
	    r.area();
	    System.out.print("Area of rectangle 2 is : ");
	    p.area();
	}
}
