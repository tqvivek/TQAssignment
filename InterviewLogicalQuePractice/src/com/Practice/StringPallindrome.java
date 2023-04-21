package com.Practice;

import java.util.Scanner;

public class StringPallindrome {

	public static void isPallindrome(String str) {
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		if (str.equals(rev)) {
			System.out.println("String Pallindrome:");
		} else
			System.out.println("String Not Pallindrome");

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = scanner.next();

		isPallindrome(str);

	}

}
