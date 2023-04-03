package com.ImpQuestions;

public class FirstLetterCapital {

	public static String capitalizeWord(String str) {
		String words[] = str.split("\\s");

		String capitalizeWord = "";

		for (String w : words) {
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			capitalizeWord += first.toUpperCase() + afterfirst + " ";
		}
		return capitalizeWord.trim();
	}

	public static void main(String[] args) {

		System.out.println(FirstLetterCapital.capitalizeWord("I love india"));
		// System.out.println(FirstLetterCapital.capitalizeWord("I am vivek dange"));

	}

}
