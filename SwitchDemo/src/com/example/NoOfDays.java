/*********1. Write a Java program print total number of days 
in a month using switch case*********/
package com.example;

import java.util.Scanner;

public class NoOfDays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int month;

		System.out.printf("Enter month number: ");
		month = sc.nextInt();

		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 Days in month");
			break;

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 Days in month");
			break;

		case 2:
			System.out.println("28 or 29 Days in month");
			break;

		default:
			System.out.println("Please enter correct input");
			break;
		}

	}

}
