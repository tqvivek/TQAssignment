//Create arraylist of 10 integers. Insert an element at 7th position.
package com.ArrayList;

import java.util.ArrayList;

public class InsertAnElement {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}

		numbers.add(7, 700);

		System.out.println(numbers);
	}

}
