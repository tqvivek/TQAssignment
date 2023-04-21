package com.ArrayLogical;

import java.util.Arrays;

public class BubbleSort {

	public static void sortArray(int[] arr) {
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
	}

	public static void main(String[] args) {
		int[] arr = { 11, 67, 23, 78, 15, 6, 90, 44 };
		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(arr));

		sortArray(arr);

		System.out.println("After sorting");
		System.out.println(Arrays.toString(arr));

	}

}
