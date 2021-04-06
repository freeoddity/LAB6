
public class SavingsAccount extends BankAccount {
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
		this.accountNumber = super.getAccountNumber() + "-" +  this.savingsNumber; 
	}
	
	public SavingsAccount(SavingsAccount s, double amount)
	{
		super(s, amount);
		this.savingsNumber++;
		this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
	}
	
	public void postInterest()
	{
		double oneMonthInterest = super.getBalance() * (rate/12);
		super.setBalance(oneMonthInterest + super.getBalance());
	}
	
	public String getAccountNumber()
	{
		return this.accountNumber;
	}
	
	

}
