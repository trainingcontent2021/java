package com.worker;

import com.model.Account;

public class AccountHolder implements Runnable {
	private Account account;

	public AccountHolder(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 2; i++) {
			makeWithdrawal(2000);
			if (account.getBalance() < 0) {
				System.out.println("account is overdrawn!");
			}
		}
	}

	private  synchronized void makeWithdrawal(int withdrawAmount) {
		/*If accountbalance is greater then withdraw amount then
				call withdraw method
		  else 
		  	print "not enough balance"
		*/ 
				
		if (account.getBalance() >= withdrawAmount) {
			System.out.println(Thread.currentThread().getName()	+ " is going to withdraw $"+withdrawAmount);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ex) {
			}
			//Call withdraw () to deduct the balance
			account.withdraw(withdrawAmount);
			System.out.println(Thread.currentThread().getName()	+ " completes the withdrawal of $"+withdrawAmount);
		} else {
			System.out.println("Not enough in account for "	+ Thread.currentThread().getName() + " to withdraw "
					+ account.getBalance());
		}
	}
}