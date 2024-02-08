package com.techm.oupp.oops.atm1;

public class Address {
	private int PinNumber;
	private String City;
	private String State;
	private String Country;
	
	Address(){}

	public void setPinNumber(int pinNumber) {
		this.PinNumber = pinNumber;
	}

	public void setCity(String city) {
		this.City = city;
	}

	public void setState(String state) {
		this.State = state;
	}

	public void setCountry(String country) {
		this.Country = country;
	}
	public int getPinNumber() {
		return PinNumber;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getCountry() {
		return Country;
	}

	
	
}
