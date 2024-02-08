package com.techm.oupp.oops.atm1;

public class Customer {
	private String Name;
	private String ContactNumber;
	private Address address;
	
	Customer(){
		address=new Address();
	}

	public void setName(String name) {
		Name = name;
	}

	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
    public String getName() {
		return Name;
	}

	public String getContactNumber() {
		return ContactNumber;
	}

	public Address getAddress() {
		return address;
	}

	public String getCustomerDetails()
    {
    	return "Name: "+getName()+"\nContact Number:"+getContactNumber()+"\n"+getAddress();
    }

}
