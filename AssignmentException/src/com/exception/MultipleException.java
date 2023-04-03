package com.exception;

public class MultipleException {

	public static void main(String[] args) {
		try {
			int arr[] = new int[3];
			arr[3] = 30 / 0;
			System.out.println(arr[4]);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
		}
	}
}
