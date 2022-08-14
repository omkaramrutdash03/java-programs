package assignment_3;
import java.util.*;
import java.util.Scanner;
class Employee
{
	String name,add;
	int year,sal;
	Employee(String n,int y,int s,String a)
	{
		name=n;
		year=y;
		sal=s;
		add=a;
	}
	void print()
	{
		System.out.println(name+"\t"+year+"\t"+sal+"\t"+add);
	}
}
public class employeeinformation {

	public static void main(String[] args) {
		String name,add;
		int year,sal;
		Employee[] emp=new Employee[3];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Employe name");
			name=sc.nextLine();
			System.out.println("Enter Employe Year of joining");
			year=sc.nextInt();
			System.out.println("Enter Employe Salary");
			sal=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employe Address");
			add=sc.nextLine();
			emp[i]=new Employee(name,year,sal,add);			
		}
		for(int i=0;i<3;i++)
		{
			emp[i].print();
		}
	
		
	}
}
