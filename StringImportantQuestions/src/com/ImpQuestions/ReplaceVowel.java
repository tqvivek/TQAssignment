package com.ImpQuestions;

public class ReplaceVowel {
	public static void replaceVowels(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || (str.charAt(i) == 'I') || (str.charAt(i) == 'O')
					|| (str.charAt(i) == 'U') || (str.charAt(i) == 'a') || (str.charAt(i) == 'e')
					|| (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u')) {
				str = str.replace(str.charAt(i), '$');
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		String str = "Java is fun";
		replaceVowels(str);
	}

}
