package com.ArrayList;

import java.util.ArrayList;

public class SizeDyanamicallyChanges {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Grapes");

		System.out.println(fruits.size());

		fruits.add("Orange");
		System.out.println(fruits.size());

		fruits.remove("Apple");

		System.out.println(fruits.size());
	}

}
