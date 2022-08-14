package assignment_3;

import java.util.Scanner;

class Complex{
	float sumr,sumi,a,b,c,d;
	 void sum(float a,float b,float c,float d){
	    	sumr=a+c;
	    	sumi=b+d;
	    	System.out.println("Sum = "+sumr+" + "+sumi+"i");
	    }
}
public class addcomplexnos {
	public static void main(String args[]) {
	float a,b,c,d;	
	Scanner sc = new Scanner(System.in);
	Complex C=new Complex();
    System.out.println("enter the real and imaginary parts of complex no.1:");
    a=sc.nextFloat();
    b=sc.nextFloat();
    System.out.println("enter the real and imaginary parts of complex no.2:");
    c=sc.nextFloat();
    d=sc.nextFloat();
    C.sum(a,b,c,d);
	}
}
