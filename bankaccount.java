package assignment_4;
import java.util.*;
class Bankaccount1{
	String name;
	float balance;
	int acno;
	 Bankaccount1(String p,float q,int r) {
	     name=p;
	     balance=q;
	     acno=r;
	 }
	 void display() {
		 System.out.println( name+"\t"+acno+"\t"+balance);
	 }
	 void deposit() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the amount you want to deposit: ");
		 float d=sc.nextFloat();
		 balance=balance+d;
	 }
	 void widthraw() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the amount you want to widthraw: ");
		 float e=sc.nextFloat();
		 balance=balance-e;
	 }
}
public class bankaccount {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the name: ");
         String name = sc.nextLine();
         System.out.print("Enter the account no: ");
         int ac = sc.nextInt();
         System.out.print("Enter the balance: ");
         float bal = sc.nextFloat();
         Bankaccount1 b=new Bankaccount1(name,bal,ac);
         System.out.println("1.display\n2.deposit\n3.display\n4.exit");
         while(true) {
         int i=sc.nextInt();
		 switch(i) {
		  case 1:b.display();
		         break;
		  case 2:b.deposit();
		         b.display();
		         break;
		  case 3:b.widthraw();
		         b.display();
		         break;
		  case 4:System.exit(0);
		  default:System.out.println("incorrect option");
		 }
        }
	}
}
