package com.ImpQuestions;

import java.util.Scanner;

public class NextAlphabet {

	public static void displayNextChar(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			ch++;
			System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = sc.next();

		displayNextChar(s);

	}

}
