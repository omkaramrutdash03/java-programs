package assignment_6;
interface operations{
	public void add(double x,double y);
	public void sub(double x,double y);
	public void mult(double x,double y);
	public void div(double x,double y);
}
interface Calculation extends operations{
	public void print(double r);
}
public class calculator implements Calculation {
    public void add(double x, double y)
    {
	        double r=x+y;
	        print(r);
    }
    public void sub(double x, double y)
    {
	        double r=x-y;
	        print(r);
    }
    public void mult(double x, double y)
    {
	        double r=x*y;
	        print(r);
    }
    public void div(double x, double y)
    {
	        double r=x/y;
	        print(r);
    }
    public void print(double r)
    {
	        System.out.println(r);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 calculator c = new calculator();
	        c.add(15, 10);
	        c.sub(30, 15);
	        c.mult(7, 9);
	        c.div(42, 6);
	}
}

