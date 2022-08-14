package assignment_2;

import java.util.Scanner;

public class maxmininterchange {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,i,max,min,a=0,b=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the total number of elements: ");
		 n=sc.nextInt();
		 int []arr=new int[10];
		 System.out.println("enter the elements: ");
		 for(i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 max=arr[0];
		 min=arr[0];
		 for(i=1;i<n;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		 }
		 for(i=0;i<n;i++) {
			 if(max==arr[i]) {
				 a=i;
			 }
			 if(min==arr[i]) {
				 b=i;
			 }
		 }
		arr[a]=min;
		arr[b]=max;
		 for(i=0;i<n;i++) {
			 System.out.print(arr[i]+" ");
		 }
	}
}
