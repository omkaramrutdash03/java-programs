package assignment_2;

import java.util.Scanner;

public class maxinarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,i,max;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the total number of elements: ");
		 n=sc.nextInt();
		 int []arr=new int[10];
		 System.out.println("enter the elements: ");
		 for(i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 max=arr[0];
		 for(i=1;i<n;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		 }
		 System.out.println("maximum is = "+max);
	}
}
