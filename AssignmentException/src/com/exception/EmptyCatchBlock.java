package com.exception;

public class EmptyCatchBlock {

	public static void main(String[] args) {
		try {
			int a = 10, b = 0;
			int c = 10 / 0;
			System.out.println(c);
		} catch (ArithmeticException e) {
			// An empty catch block
		}
	}
}
