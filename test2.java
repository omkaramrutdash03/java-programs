package assignment_6;
import java.util.*;
class Account{
	String name;
	int acc_no;
	double balance;
	Account(String name, int acc_no, double balance){
		this.name=name;
		this.acc_no=acc_no;
		this.balance=balance;
	}
	void display(){
		System.out.println(" Name : "+name+"\t Account No. : "+acc_no+"\t Balance : "+balance);
	}
	void deposit(int amt){
		balance+=amt;
		System.out.println("After Depositing :");
		display();
	}
	void withdraw(int amt) throws MinimumBalanceException{
		if(balance-amt<500)
			throw new MinimumBalanceException(balance);
		else{
			balance-=amt;
			System.out.println("After withdrawing :");
			display();
		} 
	} 
}
class MinimumBalanceException extends Exception{
	private double bal;
	MinimumBalanceException(double b){
		bal= b;
	}
	public String toString(){
		return "MinimumBalanceException Balance: "+ bal;
	} 
}
public class test2 {
	public static void main(String args[]){
		String name;
		int acc;
		double bal;
		Scanner sc = new Scanner(System.in);
		Account a[]= new Account[1];
		System.out.print("Enter Name : ");
		name=sc.next();
		System.out.print("Account No. : ");
		acc = sc.nextInt();
		System.out.print("Enter Balance : ");
		bal = sc.nextDouble();
		a[0]=new Account(name, acc, bal);
		System.out.print("Enter the amount to Deposit : ");
		int dep = sc.nextInt();
		a[0].deposit(dep);
		System.out.print("Enter the amount to Withdraw : ");
		int wid = sc.nextInt();
		try{
			a[0].withdraw(wid);
		}
		catch(MinimumBalanceException e){
			System.out.println("Withdraw failed due to "+e);
		}
	}
}

