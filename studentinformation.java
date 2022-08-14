package assignment_3;
import java.util.*;
class Student
{
	int roll_no;
	String name;
	void display(String x,int y) {
		roll_no=y;
		name=x;
		System.out.println("NAME : "+name+" ,roll no: "+roll_no);
	}
}
public class studentinformation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String a=sc.nextLine();
		System.out.println("Enter the roll no:");
		int b=sc.nextInt();
		Student st =new Student();
		st.display(a,b);
	}
}
