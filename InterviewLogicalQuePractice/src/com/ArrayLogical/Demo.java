package com.ArrayLogical;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		System.out.println(arr.length - 1);
		System.out.println(arr[3]);
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]);

			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
