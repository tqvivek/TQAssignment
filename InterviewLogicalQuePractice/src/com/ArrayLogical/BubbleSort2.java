package com.ArrayLogical;

import java.util.Arrays;

public class BubbleSort2 {

	public static void sort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] arr = { 25, 87, 363, 54, 90, 84, 12 };

		sort(arr);

		System.out.println(Arrays.toString(arr));

	}

}
