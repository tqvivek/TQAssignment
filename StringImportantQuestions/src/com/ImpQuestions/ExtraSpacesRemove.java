package com.ImpQuestions;

public class ExtraSpacesRemove {

	public static void removeExtraSpaces(String str) {
		System.out.println(str.trim());
	}

	public static void main(String[] args) {
		String str = "          India is my country       ";
		removeExtraSpaces(str);

	}
}
