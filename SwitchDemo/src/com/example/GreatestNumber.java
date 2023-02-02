//10)find which is greatest  number in between 2 numbers  using switch.

package com.example;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1 = sc.nextInt();
		System.out.println("Enter second number:");
		int n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println(n1 + "is greater number");
		} else {
			System.out.println(n2 + "is greater number");
		}

	}

}
