package com.loops;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		int temp = n;
		int rem, sum = 0;

		while (n > 0) {
			rem = n % 10;
			sum = (sum * 10) + rem;

			n /= 10;
		}
		if (temp == sum) {
			System.out.println(temp + "is Pallindrome number");
		} else
			System.out.println(temp + "not pallindrome");

	}

}
