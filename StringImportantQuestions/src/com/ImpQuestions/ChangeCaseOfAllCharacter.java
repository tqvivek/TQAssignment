package com.ImpQuestions;

public class ChangeCaseOfAllCharacter {

	public static void changeCase(String str) {
		String upper = str.toUpperCase();
		System.out.println("In UpperCase:" + upper);

		String lower = str.toLowerCase();
		System.out.println("In LowerCase:" + lower);

	}

	public static void main(String[] args) {
		String str = "JaVa";
		System.out.println("Original String :" + str);
		changeCase(str);

	}

}
