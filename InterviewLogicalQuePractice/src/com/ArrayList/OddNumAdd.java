/*Create a arraylist of integers. Add first 50 odd numbers to 
arraylist.*/
package com.ArrayList;

import java.util.ArrayList;

public class OddNumAdd {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 1; i <= 100; i += 2) {
			numbers.add(i);
			if (numbers.size() == 50)
				break;
		}
		System.out.println("ODD NUMBERS:" + numbers);

	}

}
