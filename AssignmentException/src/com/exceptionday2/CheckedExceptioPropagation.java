package com.exceptionday2;

import java.io.IOException;

public class CheckedExceptioPropagation {
	void exception() throws IOException {
		throw new IOException("device error");
	}

	void n() throws IOException {
		exception();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception handled");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}

	}

	public static void main(String[] args) {
		CheckedExceptioPropagation obj = new CheckedExceptioPropagation();
		obj.p();
	}

}
