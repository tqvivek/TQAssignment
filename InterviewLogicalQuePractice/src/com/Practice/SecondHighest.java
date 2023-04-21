package com.Practice;

import java.util.Arrays;

public class SecondHighest {

	public static void secondHighest(int[] arr) {
		int highest = Integer.MIN_VALUE;

		int second_highest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highest) {
				second_highest = highest;
				highest = arr[i];
			} else if (arr[i] > second_highest && arr[i] != highest) {
				second_highest = arr[i];
			}
		}
		System.out.println(second_highest);

	}

	public static void main(String[] args) {

		int[] arr = { 5, 2, 6, 9, 1, 8, 3, 67, 89 };

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		secondHighest(arr);

	}

}
