package com.exceptionday2;

class Sample {
	public static void check(int i) {
		if (i == 0) {
			return;
		} else {
			check(i++);
		}
	}
}

public class StackExample {

	public static void main(String[] args) {

		Sample.check(5);
	}

}
