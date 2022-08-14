package assignment_4;
import java.util.*;
class Complex{
	int real,imag;
	Complex(){}
	Complex(int r,int i){
		real=r;
		imag=i;
	}
	void display() {
		System.out.println(real+" + "+imag+"i");
	}
	void add(Complex a,Complex b) {
		Complex sum=new Complex();
		 sum.real=a.real+b.real;
		 sum.imag=a.imag+b.imag;
		 System.out.println("sum = "+sum.real+"+ "+sum.imag+"i");
		}
}
public class complexnoadd {
	public static void main(String[] args) {
	    Complex c=new Complex();
	    Complex d=new Complex();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the real and imaginary parts of complex no.1:");
	    c.real=sc.nextInt();
	    c.imag=sc.nextInt();
	    System.out.println("enter the real and imaginary parts of complex no.2:");
	    d.real=sc.nextInt();
	    d.imag=sc.nextInt();
	    c.display();
	    d.display();
	    Complex s=new Complex();
	    s.add(c,d); 
	}
}
