package com.techm.oupp.oops.atm1;

import java.util.Random;

public class Account extends Customer {
	static Random random=new Random();
	
	String AccountType;
    long AccountNumber;
	double Balance=500;
	Card card;
	
	
	Account(){
		
		AccountNumber=random.nextInt(1000000000);
		this.card=new Card();
	}

	public String getAccountType() {
		return AccountType;
	}

	 public long getAccountNumber() {
		return AccountNumber;
	}

	public double getBalance() {
		return Balance;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}


	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "\nAccount Number:"+getAccountNumber()+"\nAccountType:"+getAccountType()+"\nCard Number:"+getCard().getCardNumber()+"\nPin Number:"+getCard().getPin()+
				"\nCustomer Details:\tName:"+getName()+"\tContactNumber:"+getContactNumber()+
				"\nCustomer Address Details:\t City:"+ getAddress().getCity()+"\tState:"+getAddress().getState()+"\tCountry:"+getAddress().getCountry()+"\tPinCode:"+getAddress().getPinNumber()
				;
	}

	

	

	

	
	

}
