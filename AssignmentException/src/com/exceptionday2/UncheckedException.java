package com.exceptionday2;

public class UncheckedException {
	void division() {
		int data = 50 / 0;

	}

	void exception() {
		division();
	}

	void propagation() {
		try {
			exception();
		} catch (Exception e) {
			System.out.println("Exception handled");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}
	}

	public static void main(String[] args) {
		UncheckedException obj = new UncheckedException();
		obj.propagation();
	}
}
