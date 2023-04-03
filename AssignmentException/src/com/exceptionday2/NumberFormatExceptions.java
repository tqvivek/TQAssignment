package com.exceptionday2;

public class NumberFormatExceptions {
	void exception() {
		try {
			int a = Integer.parseInt("la");
			System.out.println(a);
		} catch (NumberFormatException e) {
			System.out.println("Number Format Exception");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}
	}

	public static void main(String[] args) {
		NumberFormatExceptions obj = new NumberFormatExceptions();
		obj.exception();
	}

}
