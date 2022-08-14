package assignment_3;
import java.util.*;
class Average{
	int a,b,c,sum;
	double average;
	void calculate(int x,int y,int z) {
		a=x;
		b=y;
		c=z;
		sum=a+b+c;
		average=sum/3;
	}
	void  print() {
		 System.out.print(" Average= "+average);
	}
}
public class find_avg{
public static void main(String args[]) {
	int a,b,c;
	Scanner sc = new Scanner(System.in);
    System.out.println("enter three numbers:");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    Average av=new Average();
    av.calculate(a, b, c);
    av.print();
 }
}
