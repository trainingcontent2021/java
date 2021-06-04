package com.client;

import com.model.Account;
import com.worker.AccountHolder;

public class ClientTest {

	public static void main(String[] args) {
		
		Account account = new Account();
		AccountHolder accountHolder = new AccountHolder(account);
		Thread t1 = new Thread(accountHolder);
		Thread t2 = new Thread(accountHolder);
		t1.setName("Sam"); //accuntholder
		t2.setName("Cherry");	//second account holder
		t1.start();
		t2.start();
	}
}
