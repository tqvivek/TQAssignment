package com.example;

import java.util.Scanner;

public class CanaraBank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BankAccount a1 = new BankAccount();

		System.out.println("Enter the Account Id:");
		a1.setAcid(sc.nextInt());
		System.out.println("Enter the Account Number:");
		a1.setAccountNumber(sc.nextLong());
		System.out.println("Enter the Name:");
		a1.setName(sc.next());
		System.out.println("Enter the starting balance:");
		a1.setBalance(sc.nextDouble());
		System.out.println("Enter the debit card number:");
		a1.setDebitCardNumber(sc.nextLong());

		System.out.println("----------------------");

		System.out.println("Account Id:" + a1.getAcid());
		System.out.println("Account Number:" + a1.getAccountNumber());
		System.out.println("Name:" + a1.getName());
		System.out.println("Balance:" + a1.getBalance());
		if (a1.getBalance() >= 10000) {
			System.out.println("Debit Card :" + a1.getDebitCardNumber());
		}

	}

}
