package assignment_4;
import java.util.Scanner;
class Employee {
    int empid;
    String name,desig;
    Employee(String p,String q,int r) {
     name=p;
     desig=q;
     empid=r;
    }
    void display() {
      System.out.println( name+"\t"+empid+"\t"+desig);
    }
}
public class employeeinform {
	public static void main(String args[]) {
	    Employee e[] = new Employee[2];
	     for(int i=0; i<2; i++) {
	    	 Scanner sc = new Scanner(System.in);
	         System.out.print("Enter the name: ");
	         String name = sc.nextLine();
	         System.out.print("Enter the designation: ");
	         String desig = sc.next();
	         System.out.print("Enter the employee id: ");
	         int empid = sc.nextInt();
	         e[i]=new Employee(name,desig,empid);	
	  }
	  for(int i=0; i<2; i++) {
	        e[i].display();
	  }
  }
}
