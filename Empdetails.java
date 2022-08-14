package assignment_5;
class Employee1{
    String empName;
    int EmpId;
    double Salary;
    Employee1(String n,int i ,Double s){
        empName = n;
        EmpId = i;
        Salary = s;

    }
    public void Details(){
        System.out.println(" ");
        System.out.println("Name = " + empName);
        System.out.println("ID = " + EmpId);
        System.out.println("Salary = " + Salary);
        System.out.println(" ");
    }
}
class Manager1 extends Employee1{
    
    Manager1(String n, int i, Double s) {
        super(n, i, s);
    }
    Double Bonus;
    public void bonus(){
        System.out.println("Bonus = " + Bonus);
    }
}
public class Empdetails {
	public static void main(String[] args) {
        Manager1 m = new Manager1("omkar", 16, 100000.0);
        m.Bonus = 2000.0;
        m.Details();
        m.bonus();
    }
}
