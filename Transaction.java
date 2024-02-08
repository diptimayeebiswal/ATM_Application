package com.techm.oupp.oops.atm1;

import java.util.ArrayList;
import java.util.Date;

public class Transaction implements CreditBalance, DebitBalance {
	String TransactionType;

	double TranscationAmount;

	Date date;

	Account account;

	ArrayList<String> al = new ArrayList<String>();
	
		

	Transaction() {
	}

	Transaction(Account account) {
		this.account = account;
	}
	
	

	@Override
	public void debitBAlance(double balance) {

		TranscationAmount = balance;
		
		double tempbal=account.getBalance();
		if (account.getBalance() < 500) {
			System.out.println("Sorry,Insufficient Balance..and Balance is:" + account.getBalance());
			System.out.println("Minimum Balance is 500");
		} else {
			System.out.println("Your Balance is:" + account.getBalance());
			this.TransactionType = "withdrawl";
			double bal = account.getBalance();
			double updatedbal = bal - balance;
			if (updatedbal < 500) {
				System.out.println("Transcation Failed....\nsorry,Minimum Balance should be 500");
				return;
			}
			account.setBalance(updatedbal);

			date = new Date();
			
			System.out.println("Successfully Debited....");
			System.out.println(TranscationAmount + ",Balance Debited...\tDate:" + date + "\tupdated Balance is:"
					+ account.getBalance());

			al.add("\nTransactionType: " + TransactionType +"\tYour Balance:"+tempbal+ "\tWithdrawl Balance: " + TranscationAmount + "\t Date: "
					+ date + "\tUpdated Balance is:" + account.Balance);

		}

	}

	@Override
	public void creditBAlance(double balance) {

		TranscationAmount = balance;
		
		double tempbal=account.getBalance();
		
		System.out.println("Your Account Balance:" + account.getBalance());
		this.TransactionType = "Deposited";
		double bal = account.getBalance();
		double updatedbal = bal + balance;
		account.setBalance(updatedbal);
		date = new Date();
		System.out.println("Successfully Credited....");
		System.out.println(TranscationAmount + ",Balance Deposited...\tDate:" + date + "\tupdated Balance is:"
				+ account.getBalance());

		al.add("\nTransactionType: " + TransactionType +"\tYour Balance:"+tempbal+ "\tDeposite Balance: " + TranscationAmount + "\t Date: " + date
				+ "\tUpdated Balance is:" + account.Balance);

	}

	// To Give Transcation Details
	public void getTransactionDetails() {
		for (String s : al) {
			System.out.println(s);
		}
	}

}
