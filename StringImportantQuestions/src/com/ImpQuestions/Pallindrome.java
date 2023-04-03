package com.ImpQuestions;

import java.util.Scanner;

public class Pallindrome {
	public static void checkPallindrome(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println("Palindrome String");
		} else
			System.out.println("Not Pallindrome String");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.next();

		checkPallindrome(s);

	}

}
