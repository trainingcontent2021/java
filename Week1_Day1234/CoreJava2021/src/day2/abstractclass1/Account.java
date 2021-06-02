package day2.abstractclass1;

public abstract class Account {
	static String BankName="HSBC Bank";
	private int accno;
	private String holderName;
	private double balance;
	
	abstract void deposit( double amt);
	abstract void withdraw(double amt );
	public static String getBankName() {
		return BankName;
	}
	public static void setBankName(String bankName) {
		BankName = bankName;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	

}
