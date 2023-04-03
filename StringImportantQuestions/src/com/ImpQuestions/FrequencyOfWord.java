package com.ImpQuestions;

public class FrequencyOfWord {

	public static int countWords(String s) {
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				count++;
		}
		return count;

	}

	public static void main(String[] args) {
		String s = "Welcome to Java.";
		System.out.println(s);

		int count1 = countWords(s);
		System.out.println("Number of words:" + count1);

	}

}
