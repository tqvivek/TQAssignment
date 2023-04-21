//Create hashset by using all constructors of hashset class.

package com.set;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {

		HashSet<String> set1 = new HashSet<>();

		HashSet<String> set2 = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));

		HashSet<String> set3 = new HashSet<>(10);

		HashSet<String> set4 = new HashSet<>(10, 0.75f);

		HashSet<String> set5 = new HashSet<>(set2);

		set1.add("Dog");
		set1.add("Cat");
		set1.add("Bird");

		System.out.println("HashSet 1: " + set1);
		System.out.println("HashSet 2: " + set2);
		System.out.println("HashSet 3: " + set3);
		System.out.println("HashSet 4: " + set4);
		System.out.println("HashSet 5: " + set5);
	}
}
