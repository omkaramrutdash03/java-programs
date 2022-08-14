package assignment_2;
import java.util.*;
public class meanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,i,sum=0;
		 float mean;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the total number of elements: ");
		 n=sc.nextInt();
		 int []arr=new int[10];
		 System.out.println("enter the elements: ");
		 for(i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 for(i=0;i<n;i++) {
			 sum=arr[i]+sum;
		 }
		 mean=sum/n;
		 System.out.println("mean = "+mean);
	}

}
