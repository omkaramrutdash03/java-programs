package assignment_5;
class Shape{
    public void print(){
        System.out.println("This is a Shape");
    }
}
class Circle extends Shape{
    public void print1(){
        System.out.println("This is a circular shape");
    }
}
class Rectangle1 extends Shape{
    public void print2(){
        System.out.println("This is a Rectangle");
    }
}
class Square1 extends Rectangle1{
    public void print3(){
        System.out.println("Square is a Rectangle");
    }
}
public class shapes {
	  public static void main(String[] args) {
	        Square1 s = new Square1();
	        s.print();
	        s.print2();
	    }
}
