package com.StringLogical;

public class ChangeCaseOfString {

	public static void changeCase(String s) {
		s = s.toUpperCase();
		System.out.println(s);

		s = s.toLowerCase();
		System.out.println(s);
	}

	public static void main(String[] args) {
		String string = "vivek";

		changeCase(string);
	}

}
