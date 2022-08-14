package assignment_4;
import java.util.*;
class Box{
	int width,depth,height;
	Box(int h,int b,int l){
		depth=h;
		width=b;
		height=l;
	}
	double Volume() {
		return depth*width*height;
	}
}
public class volumeofbox {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the height: ");
        int h = sc.nextInt();
        System.out.print("Enter the width: ");
        int b = sc.nextInt();
        System.out.print("Enter the length: ");
        int l = sc.nextInt();
		Box B=new Box(h,b,l);
		System.out.println("Volume = "+B.Volume());
	}
}
