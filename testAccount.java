class Account
{
	private double amount_d, amount_w,balance ;
	
	public void deposit(double d)
	{
		this.amount_d=d;
	}
	public void withdraw(double w)
	{
		this.amount_w=w;
	}
	public String toString()
	{
		return "Deposited amount= "+this.amount_d+"\nWithdrawl amount= "+this.amount_w+"\nBalance= "+(amount_d-amount_w);
	}
	public static void main(String args[])
	{
		Account a1=new Account();
		double d=1000000.00, w=15369.0;
		a1.deposit(d);
		a1.withdraw(w);
		int n;
		System.out.println(a1);
		
	}
}