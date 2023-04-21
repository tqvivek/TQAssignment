package com.StringLogical;

import java.util.Scanner;

public class PallindromeString {

	public static void checkPallindrome(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		if (str.equals(rev)) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.next();

		checkPallindrome(str);

	}

}
