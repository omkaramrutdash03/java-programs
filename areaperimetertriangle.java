package assignment_4;
class Triangle{
	int p,q,r,s;
	double A;
	Triangle(int a,int b,int c){
		p=a;
		q=b;
		r=c;
	}
	double Perimeter() {
		return p+q+r;
	}
	void Area() {
		s=(p+q+r)/2;
		A=Math.sqrt(s*(s-p)*(s-q)*(s-r));
		System.out.println("Area is "+A);
	}
}
public class areaperimetertriangle {

	public static void main(String[] args) {
		Triangle T=new Triangle(3,4,5);
		  System.out.println("Perimeter is "+T.Perimeter());
          T.Area();
	}
}
