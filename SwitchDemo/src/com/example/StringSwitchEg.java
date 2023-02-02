//8.write java program for switch expression is of string type..
package com.example;

import java.util.Scanner;

public class StringSwitchEg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the game name:");
		String game = sc.next();

		switch (game) {
		case "Cricket":
			System.out.println("Let's play cricket...");
			break;
		case "Football":
			System.out.println("Let's play football...");
			break;
		case "Hockey":
			System.out.println("Let's play Hockey...");
			break;
		case "Swimming":
			System.out.println("Let's swimming");
			break;
		default:
			System.out.println("incorrect input");

		}

	}

}
