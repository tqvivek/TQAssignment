package com.StringLogical;

public class CountWordsinString {

	public static void countWord(String str) {
		int count = 1;

		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == ' ' || ch[i] == '\0') {
				count++;
			}

		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		String str = "I Love India";

		countWord(str);

	}

}
