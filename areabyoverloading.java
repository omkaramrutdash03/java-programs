package assignment_6;
class findarea
{
    void area(float x)
    {
        System.out.println("area of the square is "+x*x);
    }
    void area(float x, float y)
    {
        System.out.println("area of the rectangle is "+x*y);
    }
    void area(double x)
    {
        double z = 3.14*x*x;
        System.out.println("area of the circle is "+z);
    }
}
public class areabyoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findarea ob = new findarea();
		 ob.area(4);
	     ob.area(10,20);
	     ob.area(6.5);
	}

}
