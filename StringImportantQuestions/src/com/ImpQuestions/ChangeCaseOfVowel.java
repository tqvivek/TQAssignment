package com.ImpQuestions;

public class ChangeCaseOfVowel {
	public static void changeCase(String str) {
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			switch (ch[i]) {
			case 'a':
				ch[i] = (char) (ch[i] - 32);
				break;
			case 'e':
				ch[i] = (char) (ch[i] - 32);
				break;
			case 'i':
				ch[i] = (char) (ch[i] - 32);
				break;
			case 'o':
				ch[i] = (char) (ch[i] - 32);
				break;
			case 'u':
				ch[i] = (char) (ch[i] - 32);
				break;
			}
		}
		str = new String(ch);
		System.out.println("After replacing all vowels into capital letter:" + str);
	}

	public static void main(String[] args) {
		String str = "java made so easy.";
		System.out.println("Original String:" + str);
		changeCase(str);
	}

}
