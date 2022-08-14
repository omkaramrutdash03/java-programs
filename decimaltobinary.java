package assignment_2;

import java.util.Scanner;

public class decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n,i=0,j=0,temp;
       int[]arr=new int[100];
       Scanner sc = new Scanner(System.in);
	   System.out.println("enter a number:");
	   n=sc.nextInt();
	   temp=n;
	   while(n!=0) {
		   arr[i]=n%2;
		   n=n/2;
		   i++;
	   }
	   System.out.print(" binary of  "+temp +" is ");
	   for(j=i-1;j>=0;j--) {
		   System.out.print(arr[j]+"  ");
	   }
	}

}
