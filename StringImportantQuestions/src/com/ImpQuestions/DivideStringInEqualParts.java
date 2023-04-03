package com.ImpQuestions;

import java.util.Arrays;

public class DivideStringInEqualParts {

	public static void divideString(String str) {
		int len = str.length();
		int n = 4;// no of substring
		int noofchar = len / n;

		String[] splistr = new String[4];
		int temp = 0;
		if (len % n != 0) {
			System.out.println("Cannot divide the string into equal parts..");
		} else {
			for (int i = 0; i < str.length(); i += noofchar) {
				splistr[temp] = str.substring(i, i + noofchar);
				temp++;
			}

		}
		System.out.println(Arrays.toString(splistr));

	}

	public static void main(String[] args) {
		String s = "Programmings";
		divideString(s);

	}

}
