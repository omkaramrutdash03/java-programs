package assignment_6;
import java.util.*;
class MyTime
{
	int hour,minute,second;
	MyTime()
	{
		hour=minute=second=0;
	}
	MyTime(int hour,int minute,int second)
	{
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	void add(MyTime m1,MyTime m2)
	{
		second=m1.second+m2.second;
		minute=m1.minute+m2.minute;
		hour=m1.hour+m2.hour;
		int time=second+(minute*60)+(hour*3600);
		hour=time/3600;
		minute=(time%3600)/60;
		second=time-(3600*hour+60*minute);
	}
	void display()
	{
		if(hour>12)
			hour=hour-12;
		System.out.println("Time : "+hour+":"+minute+":"+second);
	}
}
public class test1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input hour minute second for time 1");
		int h1=sc.nextInt();
		int m1=sc.nextInt();
		int s1=sc.nextInt();
		System.out.println("Input hour minute second for time 1");
		int h2=sc.nextInt();
		int m2=sc.nextInt();
		int s2=sc.nextInt();
		MyTime t1=new MyTime(h1,m1,s1);
		MyTime t2=new MyTime(h2,m2,s2);
		MyTime sum=new MyTime();
		sum.add(t1, t2);
		sum.display();
	}
}
