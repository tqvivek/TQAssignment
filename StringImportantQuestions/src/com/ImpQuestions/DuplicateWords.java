package com.ImpQuestions;

public class DuplicateWords {
	public static void findDuplicateWords(String s) {
		int count;
		s = s.toLowerCase();
		String[] words = s.split("\\s");

		for (int i = 0; i < words.length; i++) {
			count = 1;
			if (words[i].equals(" ") || (words[i].equals("visited")))
				continue;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "visited";
				}
			}
			if (count > 1) {
				System.out.println(words[i] + ":" + count);
			}
		}

	}

	public static void main(String[] args) {
		String s = "big black big black bug";
		findDuplicateWords(s);

	}

}
