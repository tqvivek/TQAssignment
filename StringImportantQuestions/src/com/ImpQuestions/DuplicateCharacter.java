//Print and count duplicate character in string....
package com.ImpQuestions;

public class DuplicateCharacter {
	public static void displayDuplicate(String s) {
		int count;
		char ch[] = s.toCharArray();
		System.out.println("Duplicate characters in a given string:");
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count++;
					ch[j] = '0';
				}
			}
			if (count > 1 && ch[i] != '0') {
				System.out.println(ch[i] + ":" + count);
			}
		}
	}

	public static void main(String[] args) {
		String s = "Welcome to AWS";
		displayDuplicate(s);
	}
}
