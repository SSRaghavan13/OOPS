package com.oops.test;

import java.util.Scanner;

public class ATM {
	
	static double checkBalance(double balance) {
		return balance;
	}
	
	static double withdraw(double balance, double amount) {
		if(balance >= amount) {
			return balance - amount;
		}
		else
			return 0;
	}

	public static void main(String[] args) {
		double balance = 101000.50;
		System.out.println("1-Check Balance\n2-Withdraw");
		Scanner sc = new Scanner(System.in);
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
			case 1: System.out.println(checkBalance(balance));
					break;
			case 2: System.out.println("Enter amount to withdraw");
					double amount = Double.parseDouble(sc.nextLine());
					double newBalance = withdraw(balance, amount);
					if(newBalance == 0) {
						System.out.println("Insufficient funds");
					}
					else
						System.out.println(newBalance);
					break;
			default:
				System.out.println("Invalid choice");
		}
	}

}
