package com.ArrayLogical;

import java.util.Arrays;

public class ArrayReverse {

	public static void reverseArray(int[] arr) {
		int i = 0, j = arr.length - 1, temp;

		while (i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;

		}

		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		reverseArray(arr);

	}

}
