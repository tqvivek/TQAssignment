package com.exception;

public class UncheckedException {

	public static void main(String[] args) {
		String data = null;
		try {
			if (data.equals("data")) {
				System.out.println("same");
			} else {
				System.out.println("not same");
			}

			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println("NullPointerException Caught");
		}
	}
}
