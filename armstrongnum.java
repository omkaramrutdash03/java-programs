package assignment_2;
import java.util.*;
public class armstrongnum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,r,c,sum=0,temp;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number: ");
		 n=sc.nextInt();
		 temp=n;
		 while(n>0) {
			 r=n%10;
			 c=r*r*r;
			 sum=sum+c;
			 n=n/10;
		 }
		if(temp==sum) {
		 System.out.println( temp +" is a armstrong number ");
	     }
		else {
			System.out.println( temp +" is not a armstrong number ");
		}
	}
}
