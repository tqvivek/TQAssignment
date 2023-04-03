package com.ImpQuestions;

public class CountTheWord {

	public static int countWord(String s1) {
		int ct = 1;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ')
				ct++;
		}
		return ct;

	}

	public static void main(String[] args) {
		String s = "My name is Vivek Dange.";
		int count = countWord(s);
		System.out.println(s);
		System.out.println("number of words:" + count);

	}

}
