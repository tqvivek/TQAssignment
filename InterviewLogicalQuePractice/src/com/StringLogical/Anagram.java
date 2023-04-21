package com.StringLogical;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void isAnagram(String str1, String str2) {

		String s1 = str1.replaceAll("\\s", " ");
		String s2 = str2.replaceAll("\\s", " ");

		boolean status = true;

		if (s1.length() != s2.length()) {

			status = false;
		} else {
			char[] Arrays1 = s1.toLowerCase().toCharArray();
			char[] Arrays2 = s2.toLowerCase().toCharArray();

			Arrays.sort(Arrays1);
			Arrays.sort(Arrays2);

			status = Arrays.equals(Arrays1, Arrays2);

			if (status) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}

		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String str1 = scanner.next();
		System.out.println("Enter 2nd String");
		String str2 = scanner.next();

		isAnagram(str1, str2);

	}

}
