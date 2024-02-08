package com.techm.oupp.oops.atm1;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Random;

public class Card {
static Random random=new Random();
	
	long  CardNumber;
	Date ExpirationDate;
    int  Pin;

	
	Card(){
		CardNumber=11027896+random.nextInt(4000);
		Pin=1000+random.nextInt(1000);
		LocalDate d=LocalDate.of(2033, 12,23);
		ExpirationDate=Date.valueOf(d);
	}
	
	
	public boolean Validation(long cardnumber,int pin)
	{
		if(this.CardNumber==cardnumber && this.Pin==pin)
		{
			return true;
		}
		return false;
		
	}

	
	public long getCardNumber() {
		return CardNumber;
	}

	public Date getExpirationDate() {
		return ExpirationDate;
	}

	public int getPin() {
		return Pin;
	}

	public void setCardNumber(long cardNumber) {
		CardNumber = cardNumber;
	}

	public void setExpirationDate(Date expirationDate) {
		ExpirationDate = expirationDate;
	}

	public void setPin(int pin) {
		Pin = pin;
	}
}
