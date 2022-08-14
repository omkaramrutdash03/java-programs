package assignment_4;
import java.util.Scanner;
class Student {
    int redgno;
    float cgpa;
    String name,branch;
    Student(String p,String q,int r,float s) {
     name=p;
     branch=q;
     redgno=r;
     cgpa=s;
    }
    void display() {
      System.out.println( name+"\t redg no. "+redgno+"\t"+branch+"\t"+cgpa);
    }
}
public class studentinform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student s[] = new Student[3];
	     for(int i=0; i<2; i++) {
	    	 Scanner sc = new Scanner(System.in);
	         System.out.print("Enter the name: ");
	         String name = sc.nextLine();
	         System.out.print("Enter the branch: ");
	         String branch = sc.next();
	         System.out.print("Enter the redgno: ");
	         int redgno = sc.nextInt();
	         System.out.print("Enter the CGPA: ");
	         float cgpa = sc.nextFloat();
	         s[i]=new Student(name,branch,redgno,cgpa);	
	  }
	  for(int i=0; i<2; i++) {
	        s[i].display();
	  }
	}

}
