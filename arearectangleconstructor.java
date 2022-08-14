package assignment_4;
class Rectangle{
	int length,breadth;
	Rectangle(int l,int b){
		length=l;
		breadth=b;
	}
	double area() {
		return length*breadth;
	}
}
public class arearectangleconstructor {
	public static void main(String[] args) {
        Rectangle a=new Rectangle(4,5);
        Rectangle b=new Rectangle(5,8);
        System.out.println(a.area());
        System.out.println(b.area());
	}
}
