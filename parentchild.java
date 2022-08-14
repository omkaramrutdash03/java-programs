package assignment_5;
class A
{
	void PrintA()
	{
		System.out.println("This is parent class");
	}
}
class B extends A
{
	void PrintB()
	{
		System.out.println("This is child class");
	}
}
public class parentchild {
	public static void main(String args[])
	{
		A obj1=new A();
		B obj2=new B();
		obj1.PrintA();
		obj2.PrintB();
		obj2.PrintA();
	}
}
