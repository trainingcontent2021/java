package day2.abstractclass1;

public class SavingAccont extends Account {

	int maxBalance=50000;
	int minBalance=10000;
	@Override
	void deposit(double amt) {
		if (amt>maxBalance)
			System.out.println(" Invalid amount to be deposit");
		else
		setBalance(getBalance()+amt);
		
		System.out.println("Dear "+getHolderName()+"  You have deposited total "+amt);
	}

	@Override
	void withdraw(double amt) {
		if (amt>minBalance)
			System.out.println(" Invalid amount to wihtdraw");
		else
		    setBalance(getBalance()+amt);
		
		System.out.println("Dear "+getHolderName()+"  You have withdraw total "+ amt +" and now balace is "+getBalance());
	}
}
