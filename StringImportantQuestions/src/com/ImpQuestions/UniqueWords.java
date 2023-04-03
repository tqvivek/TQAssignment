package com.ImpQuestions;

public class UniqueWords {
	public static void printUniqueWords(String s) {
		int count;
		String[] words = s.split("\\w");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equalsIgnoreCase(words[j])) {
					count++;
					words[j] = " ";
				}
			}
			if (count == 1 && words[i] != "")

				// Print statement
				System.out.println(words[i]);
		}

	}

	public static void main(String[] args) {
		String s = "Java Welcome to java programming ";
		printUniqueWords(s);
	}

}
