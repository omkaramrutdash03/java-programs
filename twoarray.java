package assignment_2;

import java.util.Scanner;

public class twoarray {
	public static void main(String[] args) {
		 int m,n,i,j;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the total number of rows: ");
		 m=sc.nextInt();
		 System.out.println("enter the total number of columns: ");
		 n=sc.nextInt();
		 int [][]arr=new int[10][10];
		 System.out.println("enter the elements: ");
		 for(i=0;i<m;i++) {
			 for(j=0;j<n;j++) {
				 arr[i][j]=sc.nextInt();
			 }
		 }
		 System.out.println("the inputted matrix is:");
		 for(i=0;i<m;i++) {
			 for(j=0;j<n;j++) {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
	}
}
