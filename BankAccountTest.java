class BankAccount{
	private int id;
	private String name;
	private double balance;
	public BankAccount(int id,String name,double balance){
	this.id=id;
	this.name=name;
	this.balance=balance;
	}
	public double getTotBalance(){
	return this.balance;
	}
}
class Savings extends BankAccount{
	private double fd;
	public Savings(int id,String name,double balance,double fd){
	super(id,name,balance);
	this.fd=fd;
	}
	public double getTotBalance(){
	return super.getTotBalance()+this.fd;
	}
}
class Current extends BankAccount{
	private double cc;
	public Current(int id,String name,double balance,double cc){
	super(id,name,balance);
	this.cc=cc;
	}
	public double getTotBalance(){
	return super.getTotBalance()+this.cc;
	}
}
public class BankAccountTest
{
	public static double getTotalBal(BankAccount acc[])
	{ 
	    double totalBal=0.0;
		for(int i=0;i<acc.length;i++)
		{
			totalBal+=acc[i].getTotBalance();
		}
		return totalBal;
	}
	public static void main(String args[])
	{
		BankAccount b[]=new BankAccount[2];
		b[0]=new Savings(1,"Abc",10000,2000);
		b[1]=new Current(2,"Xyz",8000,1000);
		BankAccountTest.getTotalBal(b);
		System.out.println(BankAccountTest.getTotalBal(b));
		
	}
		
}