package com.techm.oupp.oops.atm1;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 Account a=new Account();
		Transaction t1 = new Transaction(a);
		
		do {
			System.out.println("\n\n\n");
			System.out.println("Welcome to Automated Teller Machine System");
			System.out.println("...........................................");

			System.out.println("1.Customer Account Creation");
			System.out.println("2.Balance Enquiry");
			System.out.println("3.Deposite Balance");
			System.out.println("4.Withdrawl Balance");
			System.out.println("5.Transcation Details");
			System.out.println("6.Exit");
			System.out.println("Enter your Choice:");
			int i = sc.nextInt();
			
			switch (i) {
			case 1:
				System.out.println("Enter your Name:");
				String name = sc.next();
				a.setName(name);
				System.out.println("Enter your city:");
				String city = sc.next();
				a.getAddress().setCity(city);
				

				System.out.println("Enter your state:");
				String state = sc.next();
				a.getAddress().setState(state);

				System.out.println("Enter your country:");
				String country = sc.next();
				a.getAddress().setCountry(country);

				System.out.println("Enter your PinCode:");
				int pin = sc.nextInt();
				a.getAddress().setPinNumber(pin);

				System.out.println("Enter your contact Number:");
				String contact = sc.next();
				a.setContactNumber(contact);

				System.out.println("Enter Account type (Savings/Current):");
				String type = sc.next();
				a.setAccountType(type);
				System.out.println("Successfully Created......");
				System.out.println(a);
				break;
			case 2:
				System.out.println("Enter your Card Number:");
				long card3 = sc.nextLong();
				System.out.println("Enter your pin:");
				int cpin3 = sc.nextInt();

				if (a.getCard().Validation(card3, cpin3)) {
					System.out.println("Your Account Number is:" + a.getAccountNumber());
					System.out.println("Your Balance is:" + a.getBalance());
					
				} else {
					System.out.println("Enter Valid Card number And pin....");
				}
				break;
				
				

			case 3:
				System.out.println("Enter your Card Number:");
				long card = sc.nextLong();
				System.out.println("Enter your pin:");
				int cpin = sc.nextInt();

				if (a.getCard().Validation(card, cpin)) {
					System.out.println("Enter the amount to Deposite in the Account:");
					double amount = sc.nextDouble();
					t1.creditBAlance(amount);
				} else {
					System.out.println("Enter Valid Card number And pin....");
				}
				break;
				
				
			case 4:
				System.out.println("Enter your Card Number:");
				long card1 = sc.nextLong();
				System.out.println("Enter your pin:");
				int cpin1 = sc.nextInt();

				if (a.getCard().Validation(card1, cpin1)) {
					System.out.println("Enter the amount to Withdrawl in the Account:");
					double amount1 = sc.nextDouble();
					t1.debitBAlance(amount1);
				} else {
					System.out.println("Enter Valid Card number And pin....");
				}
				break;

			case 5:
				System.out.println("Enter your Card Number:");
				long card2 = sc.nextLong();
				System.out.println("Enter your pin:");
				int cpin2 = sc.nextInt();

				if (a.getCard().Validation(card2, cpin2)) {
					System.out.println("Transcation Details.....\n\n");
					t1.getTransactionDetails();
				} else {
					System.out.println("Enter Valid Card number And pin....");
				}
				break;

			case 6:
				System.out.println("Successfully exit....Thank You");
				System.exit(0);

			
			
			}
			
		}
		while(true);
	}
}
