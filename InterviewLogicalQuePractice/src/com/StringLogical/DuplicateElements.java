package com.StringLogical;

import java.util.Scanner;

public class DuplicateElements {

	public static void duplicateEle(String s1, String s2) {
		String str1 = s1.toLowerCase();
		String str2 = s2.toLowerCase();
		int count = 0;

		for (int i = 0; i < str1.length(); i++) {
			for (int j = i + 1; j < str2.length(); j++) {

				if (str1.contains(str2)) {
					count++;
				}

			}

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String:");
		String s1 = sc.next();
		System.out.println("Entre the second String:");
		String s2 = sc.next();
	}

}
