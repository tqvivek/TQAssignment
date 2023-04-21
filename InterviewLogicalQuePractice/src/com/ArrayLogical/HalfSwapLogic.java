//Logic apply for Number Of Elements Even.......
package com.ArrayLogical;

import java.util.Arrays;

public class HalfSwapLogic {

	public static void halfswap(int arr[]) {
		int temp;
		int length = arr.length;
		int mid = length / 2;
		for (int i = 0; i < mid; i++) {
			temp = arr[i];
			arr[i] = arr[mid + i];
			arr[mid + i] = temp;

		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		halfswap(arr);

		System.out.println(Arrays.toString(arr));

	}

}
