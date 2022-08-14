package assignment_4;
import java.util.*;
class Employee1{
    int empno;
    String name;
    double da,hra,basicsal,grosssal;
    Employee1(String p,float q,int r) {
     name=p;
     basicsal=q;
     empno=r;
    }
    double calGrossSal() {
    	da=0.2*basicsal;
    	hra=0.1*basicsal;
    	grosssal=basicsal+hra+da;
    	return grosssal;
    }
    void ShowEmpdetails() {
      System.out.println( name+"\t"+empno+"\t"+grosssal);
    }
}
public class employeesalcalculation {

	public static void main(String[] args) {
		Employee1 e[] = new Employee1[2];
	     for(int i=0; i<2; i++) {
	    	 Scanner sc = new Scanner(System.in);
	         System.out.print("Enter the name: ");
	         String name = sc.nextLine();
	         System.out.print("Enter the employee id: ");
	         int empid = sc.nextInt();
	         System.out.print("Enter the basic salary: ");
	         float b = sc.nextFloat();
	         e[i]=new Employee1(name,b,empid);	
	  }
	  for(int i=0; i<2; i++) {
		    e[i].calGrossSal();
	        e[i].ShowEmpdetails();;
	  }

	}

}
